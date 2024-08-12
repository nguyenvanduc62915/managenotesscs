package com.example.managernotescs.Repositories;

import com.example.managernotescs.Models.NoteTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteTagRepository extends JpaRepository<NoteTag, Integer> {
}
