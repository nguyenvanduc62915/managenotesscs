package com.example.managernotescs.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notifications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "sender")
    private Users sender;
    @ManyToOne
    @JoinColumn(name = "recipient")
    private Users recipient;
    private String notification_type;
    private String message;
    private Boolean is_read;
}
