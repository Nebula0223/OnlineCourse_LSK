package com.base.model;

import lombok.Data;

@Data
public class PageParams {
    //当前页码
    private Long pageNo = 1L;
    //每页显示记录数
    private Long pageSize = 10L;
    public PageParams() {

    }
    public PageParams(long pageNo,long pageSize) {
        this.pageNo=pageNo;
        this.pageSize=pageSize;
    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/18 12:30
 * @version 1.0
 */