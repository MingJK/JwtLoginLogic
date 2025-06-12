package com.Tokenconf.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNumber;

    @Column(unique = true)
    private String idName;
    private String password;
    private String role; // 권한 : SCOPE_ROLE_USER, SCOPE_ROLE_ADMIN, SCOPE_ROLE_MANAGER
}
