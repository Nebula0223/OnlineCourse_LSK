package com.content.service;

import com.content.mapper.CourseCategoryMapper;
import com.content.dto.CourseCategoryTreeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseCategoryServiceImpl implements CourseCategoryService {

    @Autowired
    CourseCategoryMapper courseCategoryMapper;

    //课程分类树形结构查询
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryMapper.selectTreeNodes();
    }
}
