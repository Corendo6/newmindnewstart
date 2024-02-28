package com.tofhdnsakdmatotlwkr.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String memberId;
    private String email;
    @Column(nullable = false)
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime joinDate;

    @PrePersist
    protected void onCreate() {
        joinDate = LocalDateTime.now();
    }
}
