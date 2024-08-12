package com.example.managernotescs.Repositories;

import com.example.managernotescs.Models.NoteLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteLogRepository extends JpaRepository<NoteLog, Integer> {
}
