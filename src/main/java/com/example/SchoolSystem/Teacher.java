package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="teacher")

public class Teacher {
    @Id
    @Column
    private UUID teachersId;
    @Column
    private String teachersName;
    @Column
    private UUID teachersAge;
    private UUID ClassId;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name = "course_id")
    private Course course;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name="department_id")
private Departments departments;

}
