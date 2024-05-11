package com.bj.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName users
 */
@Data
public class Users implements Serializable {
    private Integer userId;

    private String username;

    private String password;

    private String role;

    private static final long serialVersionUID = 1L;
}