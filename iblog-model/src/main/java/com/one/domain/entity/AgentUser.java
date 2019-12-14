package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Table(name = "agent_user")
@Data
@ToString
@Entity
public class AgentUser {
    @Id
    private Integer agent_user_id;
    @Column(name = "cookie")
    private String cookie;
    private String name;
    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "gmtCreatett")
    private Timestamp gmtCreate;
    private String website;
    private String email;

}
