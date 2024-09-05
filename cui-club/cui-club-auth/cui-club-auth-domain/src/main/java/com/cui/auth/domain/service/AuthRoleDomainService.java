package com.cui.auth.domain.service;

import com.cui.auth.domain.entity.AuthRoleBO;

/**
 * 角色领域service
 * 
 * @author: cui
 * @date: 2024/8/26
 */
public interface AuthRoleDomainService {

    Boolean add(AuthRoleBO authRoleBO);

    Boolean update(AuthRoleBO authRoleBO);

    Boolean delete(AuthRoleBO authRoleBO);

}
