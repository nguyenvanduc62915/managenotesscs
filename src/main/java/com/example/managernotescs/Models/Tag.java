package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tags")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_tag;
    private Boolean is_active;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_at;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updated_at;
}
