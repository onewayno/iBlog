package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;

@Table(name = "page")
@Data
@ToString
@Entity
public class Page {
    @Id
    private Integer page_id;
    private String pattern;
    private String path;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    // private Integer userId;
    private Date gmtCreate;
    private Integer isDeleted;
    private Date gmtModified;
    private String name;
    //private Integer articleId;
    /* @ManyToOne*/
    /* @JoinColumn(name = "article_id")*/
    /* private Article article;*/

//todo
   /* @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private  Article article;
*/

    private Integer articleId;
    private Integer isUsing;
    private String remark;


}
