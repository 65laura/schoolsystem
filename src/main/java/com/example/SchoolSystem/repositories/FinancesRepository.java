package com.example.SchoolSystem.repositories;

import com.example.SchoolSystem.model.Finances;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FinancesRepository extends JpaRepository<Finances, UUID> {
}
