package com.content.dto;

import com.base.pojo.Teachplan;
import com.base.pojo.TeachplanMedia;
import lombok.Data;

import java.util.List;

@Data
public class TeachplanDto extends Teachplan {
    //课程媒资信息
    private TeachplanMedia teachplanMedia;
    //课程计划子目录
    private List<TeachplanDto> teachPlanTreeNodes;
}
