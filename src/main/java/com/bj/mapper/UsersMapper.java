package com.bj.mapper;

import com.bj.pojo.Users;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Mapper
* @createDate 2024-05-11 14:45:16
* @Entity com.bj.pojo.Users
*/
public interface UsersMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int insertInfo(Users users);

    Users findByNamePsw(Users users);

}
