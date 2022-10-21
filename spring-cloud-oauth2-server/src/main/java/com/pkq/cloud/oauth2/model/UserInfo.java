package com.pkq.cloud.oauth2.model;

import lombok.Data;

import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date
 */
@Data
public class UserInfo {

    private String userId;

    //用户名
    private String username;

    //密码
    private String password;

    // 权限
    private List<String> permissions;
}
