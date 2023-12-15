package com.example.SchoolSystem;
import com.example.SchoolSystem.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public StudentEntity createStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }
    public List<StudentEntity>getAllStudents(){
        return studentRepository.findAll();
    }
   public Optional<StudentEntity>getStudentById(UUID studentId) {
        return studentRepository.findById(studentId);
}
    }
