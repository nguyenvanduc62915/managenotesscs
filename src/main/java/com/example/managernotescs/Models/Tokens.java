package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tokens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    private String token;
    private String token_type;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime expiration_date;
    private Boolean revoked;
    private Boolean expired;
}
