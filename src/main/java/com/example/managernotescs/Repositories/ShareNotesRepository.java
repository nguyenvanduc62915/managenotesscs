package com.example.managernotescs.Repositories;

import com.example.managernotescs.Models.ShareNotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareNotesRepository extends JpaRepository<ShareNotes, Integer> {
}
