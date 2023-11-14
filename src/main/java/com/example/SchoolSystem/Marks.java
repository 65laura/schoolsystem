package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "marks",schema = "public")

public class Marks {
    @Id
    @Column
    private UUID MarksId;
    @Column
    private float MarksObtained;
    @Column
    private char Ranking;
}
