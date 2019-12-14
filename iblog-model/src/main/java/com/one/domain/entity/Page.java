package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "page")
@Data
@ToString
public class Page {
    @Id
    private Integer page_id;
    private String pattern;
    private String path;
    @OneToOne(mappedBy = "user_id")
    private User user;
    // private Integer userId;
    private Date gmtCreate;
    private Integer isDeleted;
    private Date gmtModified;
    private String name;
    //private Integer articleId;
    @JoinColumn(name = "article_id")
    private Article article;
    private Integer articleId;
    private Integer isUsing;
    private String remark;


}
