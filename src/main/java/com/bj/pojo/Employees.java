package com.bj.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName employees
 */
@Data
public class Employees implements Serializable {
    private Integer employeeId;

    private String name;

    private String gender;

    private Integer age;

    private String position;

    private String contact;

    private Date hireDate;

    private Date resignationDate;

    private static final long serialVersionUID = 1L;
}