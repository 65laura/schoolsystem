package com.example.SchoolSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="finances")

public class Finances {
    @Id
    @Column
    private UUID financeId;
    @Column
    private float feesPaid;
    @Column
    private float funding;
    private UUID StudentId;
}
