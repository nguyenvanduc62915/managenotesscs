package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "share_notes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareNotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Users receiver;
    @ManyToOne
    @JoinColumn(name = "note_id")
    private Notes notes;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_at;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime update_at;
    private String status;
}
