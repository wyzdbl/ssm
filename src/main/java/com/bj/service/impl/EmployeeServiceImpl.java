package com.bj.service.impl;

import com.bj.mapper.EmployeesMapper;
import com.bj.pojo.Employees;
import com.bj.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeesMapper employeesMapper;
    @Override
    public List<Employees> findAll() {
        List<Employees> employees = employeesMapper.selectAll();
        return employees;
    }
}
