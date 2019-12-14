package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "meta")
@Data
@ToString
public class Meta {
    @Id
    private Integer meta_id;
    private String mname;
    private String type;
    private Integer count;
    private Integer sort;
    private String description;


}
