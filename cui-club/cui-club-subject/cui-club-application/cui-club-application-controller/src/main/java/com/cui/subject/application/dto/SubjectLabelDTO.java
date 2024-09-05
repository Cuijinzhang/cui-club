package com.cui.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目标签dto
 *
 * @author: cui
 * @date: 2024/7/3
 */
@Data
public class SubjectLabelDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;
    
    /**
     * 分类id
     */
    private Long categoryId;
    
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;

}

