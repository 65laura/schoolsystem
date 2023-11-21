 package com.example.SchoolSystem;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student " )
        public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
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
    private UUID CourseId;
    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    @JoinColumn(name = "fk_class_id")
    private Classes classes;

}