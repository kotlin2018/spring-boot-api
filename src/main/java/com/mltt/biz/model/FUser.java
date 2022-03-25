package com.mltt.biz.model;

import lombok.Data;

@Data
public class FUser {
    private Integer id;
    private String username;
    private String phone;
    private String created_time;
    private String updated_time;
    private String last_login_ip;
    private String register_ip;
    private String avatar;
}
