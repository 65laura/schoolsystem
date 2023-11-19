package com.example.SchoolSystem;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendance",schema = "public")

public class AttendanceEntity {


@Id
    @Column
    private Timestamp date;
    @Column
    private Boolean attendance;



}
