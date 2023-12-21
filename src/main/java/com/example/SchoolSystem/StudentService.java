package com.example.SchoolSystem;
import com.example.SchoolSystem.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public interface StudentService {
     StudentEntity createStudent(StudentEntity studentEntity);

     List<StudentEntity>getAllStudents();

    List<StudentDTO>findStudentDTOById(UUID studentId) ;

}

