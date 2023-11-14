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
    @NotNull
    private UUID studentId;
    @Column(name = "FirstName", nullable = false)
    private String firstName;
    @Column(name = "LastName", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "dob")
    private String dob;
    @Column(name = "FathersName", nullable = false)
    private String fathersName;
    @Column(name = "MothersName")
    private String mothersName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_StudentId",referencedColumnName = "StudentId")
    private List<AttendanceEntity> attendanceEntity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ClassId")
    private Classes classes;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_StudentId",referencedColumnName = "StudentId")
    private List<Finances> finances;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_StudentId",referencedColumnName = "StudentId")
    private List<Marks> marks;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_StudentId",referencedColumnName = "StudentId")
    private List <Course> courses;

}