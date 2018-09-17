package com.thumbor.example.aouth.server.service;

import com.thumbor.example.aouth.server.db.dao.UserMapper;
import com.thumbor.example.aouth.server.db.dao.UserRoleMapper;
import com.thumbor.example.aouth.server.db.entity.User;
import com.thumbor.example.aouth.server.db.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by thumbor on 2018/8/27.
 */
@Service("userDetailsService")
public class AuthUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String name)
            throws UsernameNotFoundException {
        UserDetails userDetails = null;
        try {
            User user = userMapper.findByUsername(name);
            if(user != null) {
                List<UserRole> urs = userRoleMapper.selectByUserId(user.getId());
                Collection<GrantedAuthority> authorities = new ArrayList<>();
                for(UserRole ur : urs) {
                    String roleName = ur.getName();
                    SimpleGrantedAuthority grant = new SimpleGrantedAuthority(roleName);
                    authorities.add(grant);
                }
                //封装自定义UserDetails类
                userDetails = new MyUserDetails(user, authorities);
            } else {
                throw new UsernameNotFoundException("该用户不存在！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userDetails;
    }

}
