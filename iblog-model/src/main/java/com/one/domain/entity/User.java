package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Data
@ToString
public class User {
    @Id
    private Integer user_id;
    private String name;
    private String pwd;
    private String age;
    private String sex;
    private String email;
    private String level;
    private String account;
    private String gmtCreate;
    private String qq;
    private String description;
    private String abposition;
    private String headImg;
    private String address;
    private String about;

}
