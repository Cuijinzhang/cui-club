package com.cui.auth.domain.service;

import com.cui.auth.domain.entity.AuthPermissionBO;

import java.util.List;

/**
 * 角色领域service
 * 
 * @author: cui
 * @date: 2024/8/26
 */
public interface AuthPermissionDomainService {

    Boolean add(AuthPermissionBO authPermissionBO);

    Boolean update(AuthPermissionBO authPermissionBO);

    Boolean delete(AuthPermissionBO authPermissionBO);

    List<String> getPermission(String userName);
}
