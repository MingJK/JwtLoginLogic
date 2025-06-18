package com.Tokenconf.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idnumber;

    @Column(unique = true)
    private String idname;
    private String password;
    private String role; // 권한 : SCOPE_ROLE_USER, SCOPE_ROLE_ADMIN, SCOPE_ROLE_MANAGER
}
