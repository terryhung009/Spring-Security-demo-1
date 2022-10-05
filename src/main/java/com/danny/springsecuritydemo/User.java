package com.danny.springsecuritydemo;

import javax.persistence.Entity;

@Entity
public class User {

    private Long id;
    private String username;
    private String password;
    private String role;
}
