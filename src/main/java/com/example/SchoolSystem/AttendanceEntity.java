package com.example.SchoolSystem;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendance")

public class AttendanceEntity {


@Id
    @Column
    private Date date;
    @Column
    private Boolean attendance;



}
