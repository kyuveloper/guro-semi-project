package com.gurosemiproject.petales.service;

import com.gurosemiproject.petales.mapper.ComMapper;
import com.gurosemiproject.petales.model.dto.ComDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComService {
    @Autowired
    private ComMapper comMapper;

    public ComService(ComMapper comMapper) {
        this.comMapper = comMapper;
    }

    public String comLocat() {
        String lat = comMapper.comLocat();
        return lat;
    }
}
