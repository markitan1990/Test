package com.project.lern.controller;

import com.project.lern.service.StringService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class TestController {

    private final StringService stringService;

    @GetMapping(value = "${urls.test.names}")
    public List<String> getList() {
        return stringService.getList();
    }
}
