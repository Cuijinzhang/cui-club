package com.cui.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 权限dto
 * 
 * @author: cui
 * @date: 2024/8/27
 */
@Data
public class AuthPermissionBO implements Serializable {

    private Long id;
    
    private String name;
    
    private Long parentId;
    
    private Integer type;
    
    private String menuUrl;
    
    private Integer status;
    
    private Integer show;
    
    private String icon;
    
    private String permissionKey;
}
