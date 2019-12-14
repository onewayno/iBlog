package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "disk")
@Data
@ToString
@Entity
public class Disk {
    @Id
    private Integer disk_id;
    private String name;
    private Integer size;
    private String url;
    private String type;
    private Integer parentId;
    private Date gmtCreate;
    private Date gmtModify;
    private int state;
    private String thumbUrl;
    private String hash;


}
