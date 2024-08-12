package com.example.managernotescs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Role extends JpaRepository<com.example.managernotescs.Models.Role, Integer> {
}
