package com.example.SchoolSystem;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Course",schema = "public")

public class Course {
    @Id
    @Column
    private UUID CourseId;
    @Column
    private String CourseName;
    @Column
    private String CourseDuration;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CourseId",referencedColumnName = "CourseId")
    private List<Marks> marks;
    @OneToOne(cascade = CascadeType.ALL)
    private Teacher teacher;

}
