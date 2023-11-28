package com.example.SchoolSystem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FinancesRepository extends JpaRepository<Finances, UUID> {
}
