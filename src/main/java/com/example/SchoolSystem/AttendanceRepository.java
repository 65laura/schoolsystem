package com.example.SchoolSystem;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.UUID;

public interface AttendanceRepository extends JpaRepository <AttendanceEntity, UUID> {


}
