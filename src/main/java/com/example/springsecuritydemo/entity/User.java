package com.example.springsecuritydemo.entity;
import lombok.*;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@Table
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;

}
