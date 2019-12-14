package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;

@Table(name = "article")
@Data
@ToString
@Entity
public class Article {
    @Id
    private Integer article_id;
    private String title;
    private String content;//longtext
    private Date gmtCreate;
    private String pv;
    private String thumbImg;
    private int state;
    private int isOriginal;
    private int isTop;
    private String gmtModified;
    private String identify;
    private String intro;
    private int allowComment;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private int isCustom;

}
