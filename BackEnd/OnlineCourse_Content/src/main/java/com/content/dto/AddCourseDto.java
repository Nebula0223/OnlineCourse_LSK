package com.content.dto;

import com.base.exception.ValidationGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * @author LSK
 * @version 1.0
 * @description 添加课程dto
 * @date 2022/9/7 17:40
 */
@Data
@ApiModel(value = "AddCourseDto", description = "新增课程基本信息")
public class AddCourseDto {

    @NotEmpty(groups = {ValidationGroups.Inster.class}, message = "添加课程名称不能为空")
    @NotEmpty(groups = {ValidationGroups.Update.class}, message = "修改课程名称不能为空")
    @NotEmpty(message = "课程名称不能为空")
    private String name;

    @NotEmpty(message = "适用人群不能为空")
    @Size(message = "适用人群内容过少", min = 10)
    private String users;

    //课程标签
    private String tags;

    @NotEmpty(message = "课程分类不能为空")
    //大分类
    private String mt;

    @NotEmpty(message = "课程分类不能为空")
    //小分类
    private String st;

    @NotEmpty(message = "课程等级不能为空")
    //课程等级
    private String grade;

    //教学模式（普通，录播，直播等）
    private String teachmode;

    //课程介绍
    private String description;

    //课程图片
    private String pic;

    @NotEmpty(message = "收费规则不能为空")
    //收费规则，对应数据字典
    private String charge;

    //价格
    private BigDecimal price;

    //原价
    private Float originalPrice;

    //qq
    private String qq;

    //微信
    private String wechat;

    //电话
    private String phone;

    //有效期
    private Integer validDays;
}
