package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;

@Table(name = "metaweblog_relevance")
@Data
@ToString
@Entity
public class MetaweblogRelevance {
    @Id
    private Integer metaweblog_relevance_id;

    @OneToOne
    @JoinColumn(name = "metaweblog_relevance_id")
    private MetaweblogRelevance metaweblog_relevance;
    // private Integer metaweblog_relevance;
    private String postId;

    @OneToOne
    @JoinColumn(name = "article_id")
    private Article article;
    //private Integer  articleId;


}
