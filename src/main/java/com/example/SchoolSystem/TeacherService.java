package com.example.SchoolSystem;
 import java.util.Optional;
import java.util.UUID;

    public interface TeacherService {
        Teacher createTeacher(Teacher teacher);

        Optional<TeacherDTO> findTeacherDTOById(UUID teachersId);
    }

