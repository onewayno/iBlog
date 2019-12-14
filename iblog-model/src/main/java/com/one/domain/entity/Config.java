package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "config")
@Data
@ToString
@Entity
public class Config {
    @Id
    private Integer config_id;
    private String keywords;
    private Date description;
    private String author;
    private String ICPRecord;
    private String title;
    private Date gmtCreate;
    private String emailServer;
    private String fromEmail;
    private String emailPassword;
    private String ico;
    private String logo;
    private Integer isAuditComment;
    private String qiniuAk;
    private String qiniuSk;
    private String qiniuUrl;
    private String qiniuBucket;
    private String theme;


}
