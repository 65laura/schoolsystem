package com.example.SchoolSystem;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.ref.Reference;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


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
