package com.cui.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * DTO 数据传输对象
 * 网络传输：如果这个 DTO 对象需要通过网络发送（例如，作为 REST API 的响应），它需要被序列化。
 * 存储：如果需要将该对象存储到某种持久化存储中（如数据库），序列化可以帮助将对象的状态保存。
 * 缓存：在某些情况下，可能需要将对象缓存以提高性能，序列化可以方便地将对象转存到缓存中。
 */

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author cui
 * @since 2024-08-31 21:49:59
 */
@Data
public class SubjectCategoryDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类类型
     */
    private Integer categoryType;

    /**
     * 图标连接
     */
    private String imageUrl;

    /**
     * 父级id
     */
    private Long parentId;

}

