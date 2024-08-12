package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String full_name;
    private String email;
    private String google_account;
    private String facebook_account;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    private LocalDateTime created_at;
    private Boolean is_active;
    private LocalDateTime date_of_birth;
    private String image_of_user;
}
