package com.cui.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.cui.subject.application.convert.SubjectCategoryDTOConverter;
import com.cui.subject.application.dto.SubjectCategoryDTO;
import com.cui.subject.common.entity.Result;
import com.cui.subject.domain.entity.SubjectCategoryBO;
import com.cui.subject.domain.service.SubjectCategoryDomainServie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 刷题分类控制器
 *
 * 该控制器处理与刷题分类相关的请求，包括添加新的分类。
 *
 * @author: cui
 * @date: 2024/8/31
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {

    @Resource
    private SubjectCategoryDomainServie subjectCategoryDomainServie;

    /**
     * 添加分类
     *
     * @param subjectCategoryDTO 分类数据传输对象，包含分类的详细信息
     * @return 返回操作结果，包含是否成功的布尔值
     */
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO){
        try {
            // 如果日志级别为INFO，记录传入的分类DTO信息
            if(log.isInfoEnabled()){
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            // 检查分类类型不能为空
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryType(),"分类类型不能为空");
            // 检查分类名称不能为空
            Preconditions.checkArgument(!StringUtils.isEmpty(subjectCategoryDTO.getCategoryName()),"分类名称不能为空");
            // 检查分类父级ID不能为空
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(),"分类父级id不能为空");

            // 将DTO转换为业务对象
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertBoToCategory(subjectCategoryDTO);
            // 调用领域服务添加分类
            subjectCategoryDomainServie.add(subjectCategoryBO);
            // 返回成功结果
            return Result.ok(true);
        } catch (Exception e) {
            // 记录错误日志，并返回失败结果
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }
}
