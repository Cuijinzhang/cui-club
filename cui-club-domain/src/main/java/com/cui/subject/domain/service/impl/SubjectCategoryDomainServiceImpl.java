package com.cui.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.cui.subject.domain.convert.SubjectCategoryConverter;
import com.cui.subject.domain.entity.SubjectCategoryBO;
import com.cui.subject.domain.service.SubjectCategoryDomainServie;
import com.cui.subject.infra.basic.entity.SubjectCategory;
import com.cui.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 刷题分类领域服务实现类
 *
 * 该类实现了 SubjectCategoryDomainServie 接口，负责处理与刷题分类相关的业务逻辑。
 * 包括添加分类等操作。
 */
@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainServie {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    /**
     * 添加分类
     *
     * @param subjectCategoryBO 分类业务对象，包含分类的详细信息
     */
    public void add(SubjectCategoryBO subjectCategoryBO) {
        // 如果日志级别为INFO，记录传入的分类BO信息
        if(log.isInfoEnabled()){
            log.info("SubjectCategoryController.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }

        // 将业务对象转换为持久化实体对象
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .convertBoToCategory(subjectCategoryBO);

        // 调用持久化服务插入分类
        subjectCategoryService.insert(subjectCategory);
    }
}
