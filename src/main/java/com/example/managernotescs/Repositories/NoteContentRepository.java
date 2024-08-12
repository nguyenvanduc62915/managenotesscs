package com.example.managernotescs.Repositories;

import com.example.managernotescs.Models.NoteContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteContentRepository extends JpaRepository<NoteContent, Integer> {
}
