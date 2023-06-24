package com.content.dto;

import com.base.pojo.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {
    List childrenTreeNodes;
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/23 21:32
 * @version 1.0
 */