package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@ToString
@Table(name = "comment")
public class Comment {

    @Id
    private Integer comment_id;
    private String content;
    private Date gmtCreate;
    private String name;

    private String website;
    private String email;
    @OneToOne(mappedBy = "user_id")
    //private int userId;
    private User user;
    private int parentId;
    private String identify;
    private String isAduit;
    @OneToOne(mappedBy = "user_id")
    //private int toUserId;
    private User toUser;

}
