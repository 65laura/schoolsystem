package com.example.SchoolSystem.service;
import com.example.SchoolSystem.StudentDTO;
import com.example.SchoolSystem.model.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public interface StudentService {
     StudentEntity createStudent(StudentEntity studentEntity);

     List<StudentEntity>getAllStudents();

    List<StudentDTO>findStudentDTOById(UUID studentId) ;

}

