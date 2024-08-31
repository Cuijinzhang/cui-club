package com.cui.subject.application.controller;

// 导入所需的类
import com.cui.subject.infra.basic.entity.SubjectCategory;
import com.cui.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource; // 导入 Resource 注解

/**
 * 刷题控制器
 *
 * @author: cui
 * @date: 2024/8/31
 */
@RestController // 标识该类为 REST 控制器
public class SubjectController {

    @Resource // 注入 SubjectCategoryService 实例
    private SubjectCategoryService subjectCategoryService;

    // 定义一个 GET 请求的处理方法
    @GetMapping("/test") // 当访问 /test 路径时调用该方法
    public String test(){
        // 调用服务层的方法，根据 ID 查询科目分类
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        // 返回科目分类的名称
        return subjectCategory.getCategoryName();
    }
}
