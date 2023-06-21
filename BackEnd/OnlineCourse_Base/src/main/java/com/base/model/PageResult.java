package com.base.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {
    private List<T> items;
    public long counts;
    private long page;
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/18 13:04
 * @version 1.0
 */