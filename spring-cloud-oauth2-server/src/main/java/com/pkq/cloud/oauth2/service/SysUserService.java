package com.pkq.cloud.oauth2.service;

import com.pkq.cloud.oauth2.model.UserInfo;

/**
 * @Author qcl
 * @Description
 * @Date
 */
public interface SysUserService {
    UserInfo getUserByUserName(String userName);
}
