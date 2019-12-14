package com.one.domain.entity;

import com.sun.jmx.snmp.Timestamp;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;


import javax.persistence.*;

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
    private Date gmtCreatett;
    private String website;
    private String email;

}
