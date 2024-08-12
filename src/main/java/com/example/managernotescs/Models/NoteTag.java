package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "note_tags")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "note_id")
    private Notes notes;
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
