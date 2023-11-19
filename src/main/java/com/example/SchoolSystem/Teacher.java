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
@Table(name="teacher",schema = "public")

public class Teacher {
    @Id
    @Column
    private UUID teachersId;
    @Column
    private String teachersName;
    @Column
    private UUID teachersAge;
@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_class_id")
    private List<Classes> classes;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name = "fk_course_id")
    private Course course;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name="fk_department_id")
private Departments departments;

}
