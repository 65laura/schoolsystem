package com.example.SchoolSystem;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")

public class Classes {
    @Id
    @Column
    private UUID classID;
    @Column
    @JsonAlias("Class_name")
    private String className;
    private UUID TeachersId;
    @OneToOne(mappedBy = "classes")
    private StudentEntity studentEntity;


}
