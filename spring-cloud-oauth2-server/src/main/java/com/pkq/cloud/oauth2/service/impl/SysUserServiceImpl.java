package com.pkq.cloud.oauth2.service.impl;

import com.pkq.cloud.oauth2.model.UserInfo;
import com.pkq.cloud.oauth2.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author qcl
 * @Description mock用户服务
 * @Date
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Override
    public UserInfo getUserByUserName(String userName) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ADMIN");
        UserInfo user = new UserInfo();
        user.setUserId("1111");
        user.setPassword("123321");
        user.setUsername(userName);
        user.setPermissions(list);
        return user;
    }
}
