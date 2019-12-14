package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "nav")
@Data
@ToString
public class Nav {
    @Id
    private Integer nav_id;
    private String title;
    private String url;
    private Integer sort;


}
