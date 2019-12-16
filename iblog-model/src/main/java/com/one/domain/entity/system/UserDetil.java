package com.one.domain.entity.system;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class UserDetil {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "jpa-uuid")
    private String user_id;
    private String chn_name;
    private String login_name;
    private String password;
    private String age;
    private String sex;
    private String email;
    private Date create_date;
    private String qq;
    private String description;
    private String head_img;
    private String address;
    private String about;
    private String expiry_date;
    private String fail_count;
    private String unlock_time;
    private String locked;
    @Column(name = "last_login_time")
    private Date lastLoginTime;
    private String status;

}
