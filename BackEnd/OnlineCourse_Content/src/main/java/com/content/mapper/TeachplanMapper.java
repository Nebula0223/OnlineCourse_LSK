package com.content.mapper;

import com.base.pojo.Teachplan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.content.dto.TeachplanDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author LSK
 * @since 2023-06-17
 */
@Mapper
public interface TeachplanMapper extends BaseMapper<Teachplan> {
    List<TeachplanDto> selectTreeNodes(Long courseId);
}
