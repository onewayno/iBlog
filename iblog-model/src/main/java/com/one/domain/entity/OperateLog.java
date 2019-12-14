package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;

@Table(name = "operate_log")
@Data
@ToString
@Entity
public class OperateLog {
    @Id
    private Integer pkId;
    private String gmtCreate;
    //private int userId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;  //操作人
    //  private String  userId;
    private Integer type;
    private Integer data;
    private Integer url;
    private Integer moduleName;


}
