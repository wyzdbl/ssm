package com.bj.mapper;

import com.bj.pojo.Employees;

import java.util.List;

/**
* @author Administrator
* @description 针对表【employees】的数据库操作Mapper
* @createDate 2024-05-11 14:23:09
* @Entity com.bj.pojo.Employees
*/
public interface EmployeesMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);

    List<Employees> selectAll();


}
