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
@Table(name = "departments",schema = "public")

public class Departments {
    @Id
    @Column
    private UUID departmentId;
    @Id
    @Column
    private String departmentName;
    @Column
    private UUID members;
    @Column
    private String membersName;
    @OneToOne(cascade = CascadeType.ALL)
    private Teacher teacher;
    @OneToOne(cascade = CascadeType.ALL)
    private Staff staff;
}
