package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "operate_log")
@Data
@ToString
public class OperateLog {
    @Id
    private Integer pkId;
    private String gmtCreate;
    //private int userId;
    @OneToOne(mappedBy = "user_id")
    private User user;  //操作人
    //  private String  userId;
    private Integer type;
    private Integer data;
    private Integer url;
    private Integer moduleName;


}
