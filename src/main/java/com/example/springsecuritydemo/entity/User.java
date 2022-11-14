package com.example.springsecuritydemo.entity;

import lombok.*;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Table
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
