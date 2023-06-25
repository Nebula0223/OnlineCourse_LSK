package com.content.controller;

import com.base.exception.ValidationGroups;
import com.base.model.PageParams;
import com.base.model.PageResult;
import com.base.pojo.CourseBase;
import com.content.dto.AddCourseDto;
import com.content.dto.CourseBaseInfoDto;
import com.content.dto.EditCourseDto;
import com.content.dto.QueryCourseParamsDto;
import com.content.service.CourseBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //相当于@Controller和@ResponseBody
public class CourseBaseInfoController {
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    //课程分页查询
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams) {
        return courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParams);
    }

    //新增课程
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody AddCourseDto addCourseDto) {
        //机构id，由于认证系统没有上线暂时硬编码
        Long companyId = 22L;
        return courseBaseInfoService.createCourseBase(companyId, addCourseDto);
    }

    //根据课程id查询课程基础信息
    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId){
        return courseBaseInfoService.getCourseBaseInfo(courseId);
    }

    //修改课程信息
    @PutMapping("/course")
    public CourseBaseInfoDto modifyCourseBase(@RequestBody EditCourseDto editCourseDto){
        //机构id，由于认证系统没有上线暂时硬编码
        Long companyId = 1232141425L;
        return courseBaseInfoService.updateCourseBase(companyId,editCourseDto);
    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/19 17:19
 * @version 1.0
 */