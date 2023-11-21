package com.example.SchoolSystem;

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
@Table(name = "marks")

public class Marks {
    @Id
    @Column
    @JsonInclude(JsonInclude.Include.NON_NULL)
   private int marksId;
    @Column
    private float marksObtained;
    @Column
    private char ranking;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_student_id")
    private StudentEntity studentEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}
