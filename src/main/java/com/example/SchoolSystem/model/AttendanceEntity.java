package com.example.SchoolSystem.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendance")

public class AttendanceEntity {


@Id
    @Column
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date date;
    @Column
    private Boolean attendance;
    private UUID StudentId;



}
