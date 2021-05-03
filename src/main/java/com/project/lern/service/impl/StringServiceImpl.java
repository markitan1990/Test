package com.project.lern.service.impl;

import com.project.lern.service.StringService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StringServiceImpl implements StringService {
    @Override
    public List<String> getList() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add("Name " + (i + 1));
        }

        return list;
    }
}
