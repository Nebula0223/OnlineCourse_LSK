package com.content.mapper;

import com.base.pojo.CourseTeacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课程-教师关系表 Mapper 接口
 * </p>
 *
 * @author LSK
 * @since 2023-06-17
 */
@Mapper
public interface CourseTeacherMapper extends BaseMapper<CourseTeacher> {

}
