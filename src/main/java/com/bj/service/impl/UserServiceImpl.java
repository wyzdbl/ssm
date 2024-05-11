package com.bj.service.impl;

import com.bj.mapper.UsersMapper;
import com.bj.pojo.Users;
import com.bj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public void insertInfo(Users users) {
        usersMapper.insertInfo(users);
    }

    @Override
    public Users findByNamePsw(Users users) {
        Users byNamePsw = usersMapper.findByNamePsw(users);
        return byNamePsw;
    }
}
