package com.cui.auth.domain.convert;

import com.cui.auth.domain.entity.AuthPermissionBO;
import com.cui.auth.infra.basic.entity.AuthPermission;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限bo转换器
 * 
 * @author: cui
 * @date: 2024/7/8
 */
@Mapper
public interface AuthPermissionBOConverter {

    AuthPermissionBOConverter INSTANCE = Mappers.getMapper(AuthPermissionBOConverter.class);

    AuthPermission convertBOToEntity(AuthPermissionBO authPermissionBO);

}
