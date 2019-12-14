package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "metaweblog_config")
@Data
@ToString
@Entity
public class MetaweblogConfig {
    @Id
    private Integer metaweblog_config_id;
    private String website;
    private String userName;
    private String password;
    private Date gmtCreate;
    private String url;


}
