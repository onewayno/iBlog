package com.one.domain.entity;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "relevancy")
@Data
@ToString
@Entity
public class Relevancy {
    @Id
    private Integer relevancy_id;
    private Integer mid;
    private Integer cid;


}
