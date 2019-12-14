package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "metaweblog_relevance")
@Data
@ToString
public class MetaweblogRelevance {
    @Id
    private Integer metaweblog_relevance_id;
    @JoinColumn(name = "metaweblog_relevance_id")
    private MetaweblogRelevance metaweblog_relevance;
    // private Integer metaweblog_relevance;
    private String postId;

    @JoinColumn(name = "article_id")
    private Article article;
    //private Integer  articleId;


}
