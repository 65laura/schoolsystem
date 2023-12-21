package com.example.SchoolSystem.repositories;

import com.example.SchoolSystem.model.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttendanceRepository extends JpaRepository <AttendanceEntity, UUID> {


}
