package com.cui.auth.domain.service;


import cn.dev33.satoken.stp.SaTokenInfo;
import com.cui.auth.domain.entity.AuthUserBO;

/**
 * 用户领域service
 * 
 * @author: cui
 * @date: 2024/8/26
 */
public interface AuthUserDomainService {

    /**
     * 注册
     */
    Boolean register(AuthUserBO authUserBO);

    /**
     * 更新用户信息
     */
    Boolean update(AuthUserBO authUserBO);

    /**
     * 更新用户信息
     */
    Boolean delete(AuthUserBO authUserBO);

    SaTokenInfo doLogin(String validCode);

    AuthUserBO getUserInfo(AuthUserBO authUserBO);

}

