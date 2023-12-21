package com.example.SchoolSystem.repositories;

import com.example.SchoolSystem.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassesRepository extends JpaRepository<Classes, UUID> {
}
