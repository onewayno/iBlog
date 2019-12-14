package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;

@Table(name = "session")
@Data
@ToString
@Entity
public class Session {
    @Id
    private String session_id;
    private Integer expireAt;
    //private Integer userId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
