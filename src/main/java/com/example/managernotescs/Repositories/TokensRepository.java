package com.example.managernotescs.Repositories;

import com.example.managernotescs.Models.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokensRepository extends JpaRepository<Tokens, Integer> {
}
