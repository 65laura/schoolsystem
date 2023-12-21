package com.example.SchoolSystem.model;

import com.example.SchoolSystem.model.Departments;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "staff")
public class Staff {
    @Id
    @Column
    private UUID staffId;
    @Column
    private String staffName;
    @Column
    float salary;
    @OneToOne(mappedBy = "staff")
    @JoinColumn(name = "department_id")
    private Departments departments;

}
