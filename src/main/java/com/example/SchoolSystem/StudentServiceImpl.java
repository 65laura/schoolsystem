package com.example.SchoolSystem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    public StudentRepository studentRepository;
    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }
    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<StudentDTO> findStudentDTOById(UUID studentId) {
        return studentRepository.findStudentDTOById(studentId);
    }

}


