 package com.example.SchoolSystem;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@JsonPropertyOrder({"studentId","firstName","lastName","fathersName","mothersName","gender","dob"})
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UUID studentId;
    @Column
    @JsonAlias({"f_name"})
    private String firstName;
    @Column
    @JsonAlias({"l_name"})
    private String lastName;
    @Column
    private String gender;
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dob;
    @Column
    private String fathersName;
    @Column
    private String mothersName;

    @OneToMany(mappedBy = "studentEntity",cascade = CascadeType.PERSIST)
    private List<AttendanceEntity> attendanceEntity;
    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    @JoinColumn(name = "fk_class_id")
    private Classes classes;
    @OneToMany(mappedBy = "studentEntity",cascade =CascadeType.PERSIST)
    private List<Finances> finances;
    @OneToMany(mappedBy = "studentEntity",cascade = CascadeType.PERSIST)
    private List<Marks> marks;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_course_id")
    private List <Course> courses;

}