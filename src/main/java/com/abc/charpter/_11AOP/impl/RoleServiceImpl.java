package com.abc.charpter._11AOP.impl;

import com.abc.charpter._11AOP.vo.Role;
import org.springframework.stereotype.Service;

/**
 * Created on 2019/11/4 in ssmredisnowebapp 项目 .
 */
@Service
public class RoleServiceImpl implements RoleService {
    public void printRole(Role role) {
        System.out.println(role.getName());
    }
}
