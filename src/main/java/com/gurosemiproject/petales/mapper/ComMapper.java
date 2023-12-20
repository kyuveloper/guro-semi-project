package com.gurosemiproject.petales.mapper;

import com.gurosemiproject.petales.model.dto.ComDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComMapper {
    String comLocat();
}
