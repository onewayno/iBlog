package com.one.domain.entity.system;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ss")
public class UserDetil {

    @Id
    @Column(name = "username")
    private String username;
    private String password;

    private boolean accountExpired;
    private boolean accountLocked;
    private boolean credentialsExpired;
    private boolean disabled;
    private String post;
    private String userFullName;
    private boolean divisionAdminInd;
    private boolean systemAdminInd;
    private Integer postId;
    private Integer divisionId;
    private String division;
}
