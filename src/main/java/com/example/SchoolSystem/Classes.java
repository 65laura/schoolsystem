package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes",schema = "public")

public class Classes {
    @Id
    @Column(name = "ClassId",nullable = false)
    private UUID ClassID;
    @Column(name = "ClassName",nullable = false)
    private String ClassName;
    @OneToOne(mappedBy = "classes")
    private StudentEntity studentEntity;


}
