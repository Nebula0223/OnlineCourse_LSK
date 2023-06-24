package com.content.controller;

import com.content.dto.CourseCategoryTreeDto;
import com.content.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseCategoryController {
    @Autowired
    CourseCategoryService courseCategoryService;

    //课程分类树形结构查询
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryService.queryTreeNodes();
    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/23 21:34
 * @version 1.0
 */