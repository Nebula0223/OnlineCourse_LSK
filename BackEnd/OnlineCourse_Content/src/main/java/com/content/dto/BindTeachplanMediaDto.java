package com.content.dto;

import lombok.Data;

@Data
//教学计划-媒资绑定
public class BindTeachplanMediaDto {
    //媒资文件id
    private String mediaId;
    //媒资文件名称
    private String fileName;
    //课程计划标识
    private Long teachplanId;
}
