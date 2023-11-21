package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Course")

public class Course {
    @Id
    @Column
    private UUID courseId;
    @Column
    private String courseName;
    @Column
    private String CourseDuration;
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Marks> marks;
    @OneToOne (mappedBy = "course",cascade =CascadeType.PERSIST)
    private Teacher teacher;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private StudentEntity studentEntity;

}
