package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "session")
@Data
@ToString
public class Session {
    @Id
    private String session_id;
    private Integer expireAt;
    //private Integer userId;
    @OneToOne(mappedBy = "user_id")
    private User user;


}
