package com.content.service;

import com.content.dto.CourseCategoryTreeDto;
import java.util.List;

public interface CourseCategoryService  {

    //课程分类树形结构查询
    public List<CourseCategoryTreeDto> queryTreeNodes();
}
