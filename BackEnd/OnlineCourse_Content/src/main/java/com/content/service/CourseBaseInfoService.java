package com.content.service;

import com.base.model.PageParams;
import com.base.model.PageResult;
import com.base.pojo.CourseBase;
import com.content.dto.AddCourseDto;
import com.content.dto.CourseBaseInfoDto;
import com.content.dto.EditCourseDto;
import com.content.dto.QueryCourseParamsDto;

public interface CourseBaseInfoService {

    //课程分页查询
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    //新增课程
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    //根据课程id查询课程基本信息
    CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    //修改课程信息
    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/21 18:16
 * @version 1.0
 */