package com.example.SchoolSystem;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private int teachersAge;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JsonInclude(JsonInclude.Include.NON_NULL)
@JoinColumn(name = "Fk_class_id")
    private List<Classes> classes;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "fk_course_id")
    private Course course;
@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name="fk_department_id")
private Departments departments;

}
