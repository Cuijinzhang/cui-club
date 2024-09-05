package com.cui.subject.domain.service;

import com.cui.subject.common.entity.PageResult;
import com.cui.subject.domain.entity.SubjectInfoBO;

/**
 * 题目领域服务
 * 
 * @author: cui
 * @date: 2024/7/3
 */
public interface SubjectInfoDomainService {

    /**
     * 新增题目
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 分页查询
     */
    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    /**
     * 查询题目信息
     */
    SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO);

}

