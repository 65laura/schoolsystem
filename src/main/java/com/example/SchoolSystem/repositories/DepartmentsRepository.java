package com.example.SchoolSystem.repositories;

import com.example.SchoolSystem.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DepartmentsRepository extends JpaRepository<Departments, UUID> {
}
