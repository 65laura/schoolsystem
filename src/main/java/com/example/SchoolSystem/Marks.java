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
@Table(name = "marks")

public class Marks {
    @Id
    @Column
   private UUID marksId;
    @Column
    private float marksObtained;
    @Column
    private char ranking;
    private UUID StudentId;
    private UUID CourseId;
}
