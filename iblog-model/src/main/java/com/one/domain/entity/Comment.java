package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Table(name = "comment")
@Entity
public class Comment {

    @Id
    private Integer comment_id;
    private String content;
    private Date gmtCreate;
    private String name;

    private String website;
    private String email;
  /*  @OneToOne
    @JoinColumn(name = "user_id")
    private User user;*/


    private int parentId;
    private String identify;
    private String isAduit;
    /*@OneToOne
    @JoinColumn(name = "user_id")
    private User toUser;*/
    //  private User toUser;

}
