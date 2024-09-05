package com.cui.subject.domain.service;

import com.cui.subject.domain.entity.SubjectCategoryBO;

/**
 * 刷题分类领域服务接口
 *
 * 该接口定义了与刷题分类相关的领域服务操作。
 * 主要用于处理分类的业务逻辑。
 *
 */
public interface SubjectCategoryDomainServie {

    /**
     * 添加分类
     *
     * @param subjectCategoryBO 分类业务对象，包含分类的详细信息
     */
    void add(SubjectCategoryBO subjectCategoryBO);
}
