package com.example.SchoolSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Course")

public class Course {
    @Id
    @Column
    private UUID courseId;
    @Column
    private String courseName;
    @Column
    private String courseDuration;
    private UUID StudentId;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Teacher teacher;

}
