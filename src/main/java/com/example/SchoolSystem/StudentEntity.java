package com.example.SchoolSystem;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student",schema = "public")

public class StudentEntity {
    @Id
    @GeneratedValue
    @Column
   @NotNull private UUID studentId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private String dob;
    @Column
    private String fathersName;
    @Column
    private String mothersName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkstudent_id")
    private List<AttendanceEntity> attendanceEntity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_class_id")
    private Classes classes;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private List<Finances> finances;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_student_id")
    private List<Marks> marks;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private List <Course> courses;

}