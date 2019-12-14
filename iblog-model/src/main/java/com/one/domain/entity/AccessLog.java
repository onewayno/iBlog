package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "access_log")
@Data
@ToString
public class AccessLog {
    @Id
    private Integer access_log_id;
    private Date gmtCreate;
    private String referer;
    private String target;
    private String ip;
    private String cookie;
    private String info;
    private String userAgent;

    @OneToMany
    @JoinColumn(name = "agent_user_id")
    //  private Integer agentUserId;
    private List<AgentUser> agentUserList;


}
