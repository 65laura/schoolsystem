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
@Table(name = "staff",schema = "public")

public class Staff {
    @Id
    @Column
    private UUID StaffId;
    @Column
    private String StaffName;
    @Column
    float Salary;
    @OneToOne(mappedBy = "staff")
    @JoinColumn(name = "fk_DepartmentName")
    private Departments departments;

}
