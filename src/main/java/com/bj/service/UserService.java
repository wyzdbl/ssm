package com.bj.service;

import com.bj.pojo.Users;

public interface UserService {

    void insertInfo(Users users);
    Users findByNamePsw(Users users);
}
