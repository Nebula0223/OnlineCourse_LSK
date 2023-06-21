package com.content.controller;

import com.base.model.PageParams;
import com.base.model.PageResult;
import com.base.pojo.CourseBase;
import com.content.dto.QueryCourseParamsDto;
import com.content.service.CourseBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //相当于@Controller和@ResponseBody
public class CourseBaseInfoController {
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){
        //return courseBaseInfoService.queryCourseBaseList(pageParams,queryCourseParams);
        System.out.println("hello");
        System.out.println(pageParams.getPageNo());
        System.out.println(pageParams.getPageSize());
        return courseBaseInfoService.queryCourseBaseList(pageParams,queryCourseParams);
    }

//    @PostMapping("/course")
//    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated({ValidationGroups.Inster.class}) AddCourseDto addCourseDto){
//        //机构id，由于认证系统没有上线暂时硬编码
//        Long companyId = 1L;
//        return courseBaseInfoService.createCourseBase(companyId,addCourseDto);
//    }
//
//    @GetMapping("/course/{courseId}")
//    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId){
//        return courseBaseInfoService.getCourseBaseInfo(courseId);
//    }
//
//    @PutMapping("/course")
//    public CourseBaseInfoDto modifyCourseBase(@RequestBody @Validated EditCourseDto editCourseDto){
//        //机构id，由于认证系统没有上线暂时硬编码
//        Long companyId = 1232141425L;
//        return courseBaseInfoService.updateCourseBase(companyId,editCourseDto);
//    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/19 17:19
 * @version 1.0
 */