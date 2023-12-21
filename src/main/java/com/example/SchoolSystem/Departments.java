package com.example.SchoolSystem;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")

public class Departments {
    @Id
    @Column
    private UUID departmentId;
    @Column
    private String departmentName;
    @Column
    @JsonAlias("department_members")
    private int members;
    @Column
    private String membersName;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Teacher teacher;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Staff staff;
}
