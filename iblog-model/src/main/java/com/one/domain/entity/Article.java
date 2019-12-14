package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "article")
@Data
@ToString
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

    @OneToOne(mappedBy = "user_id")
    private User user;
    private int isCustom;

}
