package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Teacher",schema = "public")

public class Teacher {
    @Id
    @Column
    private UUID TeachersId;
    @Column
    private String TeachersName;
    @Column
    private UUID TeachersAge;
@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ClassId")
    private List<Classes> classes;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name = "fk_CourseId")
    private Course course;
@OneToOne(mappedBy = "teacher")
@JoinColumn(name="fk_DepartmentId")
private Departments departments;

}
