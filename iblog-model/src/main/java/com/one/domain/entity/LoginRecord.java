package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "login_record")
@Data
@ToString
public class LoginRecord {
    @Id
    private Integer login_record_id;
    private Date gmtCreate;
    private String ip;
    @JoinColumn(name = "session_id")
    // private String sessionId;
    private Session session;
    private String device;
    private Integer isValid;


}
