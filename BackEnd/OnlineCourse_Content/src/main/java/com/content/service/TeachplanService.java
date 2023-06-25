package com.content.service;

import com.base.pojo.Teachplan;
import com.content.dto.BindTeachplanMediaDto;
import com.content.dto.SaveTeachplanDto;
import com.content.dto.TeachplanDto;
import com.base.pojo.Teachplan;

import java.util.List;

public interface TeachplanService {
    List<TeachplanDto> findTeachplanTree(Long courseId);

    public void saveTeachplan(SaveTeachplanDto teachplanDto);

    void deleteTeachplan(Long teachplanId);

    void orderByTeachplan(String moveType, Long teachplanId);

    Teachplan getTeachplan(Long teachplanId);

    //教学计划绑定媒资信息
    void associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);

    //解绑教学计划与媒资信息
    void unassociationMedia(Long teachPlanId, String mediaId);
}
