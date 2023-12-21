package com.example.SchoolSystem.repositories;

import com.example.SchoolSystem.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MarksRepository extends JpaRepository<Marks, UUID> {
}
