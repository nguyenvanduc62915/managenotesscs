package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "note_contents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "note_id")
    private Notes notes;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Users owner;
    @Enumerated(EnumType.STRING)
    private ContentTypes content_type;
    private String image_url;
    private String text_content;
    @Enumerated(EnumType.STRING)
    private StatusContent status_content;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_at;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updated_at;
}
