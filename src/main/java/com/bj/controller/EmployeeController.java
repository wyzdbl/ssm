package com.bj.controller;

import com.bj.pojo.Employees;
import com.bj.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @RequestMapping("findAll")
    public List<Employees> findAll(){
        return employeeService.findAll();
    }
}
