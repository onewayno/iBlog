package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "baidu_seo_config")
@Data
@ToString
public class BaiduSeoConfig {
    @Id
    private Integer baidu_seo_config_id;
    private String site;
    private String token;

}
