package com.example.SchoolSystem.service;
 import com.example.SchoolSystem.model.Teacher;
 import com.example.SchoolSystem.TeacherDTO;

 import java.util.Optional;
import java.util.UUID;

    public interface TeacherService {
        Teacher createTeacher(Teacher teacher);

        Optional<TeacherDTO> findTeacherDTOById(UUID teachersId);
    }

