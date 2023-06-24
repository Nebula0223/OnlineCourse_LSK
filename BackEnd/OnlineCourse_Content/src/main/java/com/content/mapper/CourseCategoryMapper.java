package com.content.mapper;

import com.base.pojo.CourseCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.content.dto.CourseCategoryTreeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author LSK
 * @since 2023-06-17
 */
@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {
    List<CourseCategoryTreeDto> selectTreeNodes();
}
