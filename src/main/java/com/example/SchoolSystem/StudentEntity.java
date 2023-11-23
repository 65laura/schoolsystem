package com.example.SchoolSystem;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@JsonPropertyOrder({"studentId","firstName","lastName","dob","gender","mothersName","fathersName"})
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID studentId;
    @Column
    @JsonAlias("first_name")
    private String firstName;
    @Column
    @JsonAlias("last_name")
    private String lastName;
    @Column
    private String gender;
    @Column
    private String dob;
    @Column
    private String fathersName;
    @Column
    private String mothersName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id")
    private Classes classes;
    private UUID CourseId;

}