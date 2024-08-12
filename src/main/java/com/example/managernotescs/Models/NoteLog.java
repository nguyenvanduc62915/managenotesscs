package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "note_logs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "note_id")
    private Notes notes;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    private String action;
    @Column(columnDefinition = "TEXT")
    private String old_content;
    @Column(columnDefinition = "TEXT")
    private String new_content;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_at;
}
