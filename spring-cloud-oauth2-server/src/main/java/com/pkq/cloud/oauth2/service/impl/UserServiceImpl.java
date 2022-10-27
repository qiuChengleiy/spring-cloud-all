package com.pkq.cloud.oauth2.service.impl;

import cn.hutool.json.JSONObject;
import com.pkq.cloud.oauth2.model.UserInfo;
import com.pkq.cloud.oauth2.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description 用户信息
 * @Date
 */
@Slf4j
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserInfo userInfo = sysUserService.getUserByUserName(userName);
        log.warn("user: " + userInfo.getUsername());
        if (userInfo == null){
            throw new UsernameNotFoundException("用户不存在: " + userName);
        }

        List<GrantedAuthority> authorities=new ArrayList<>();
        //获取用户权限
        List<String> permissions = userInfo.getPermissions();
        permissions.forEach(permission->{
            authorities.add(new SimpleGrantedAuthority("ROLE_" + permission));
        });
        UserDetails user = new User(userInfo.getUsername(), new BCryptPasswordEncoder().encode(userInfo.getPassword()), authorities);
        log.warn(user.toString());
        return user;
    }
}

