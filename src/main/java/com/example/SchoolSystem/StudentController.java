package com.example.SchoolSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    private StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity studentEntity){
        StudentEntity newStudent= studentService.createStudent(studentEntity);
    return ResponseEntity.ok(newStudent);
    }
    @GetMapping
    public ResponseEntity<List<StudentEntity>>getAllStudents(){
      List<StudentEntity> Students= studentService.getAllStudents();
      return ResponseEntity.ok(Students);

    }
    @GetMapping("/one/{studentId}")
    public Optional<StudentDTO>findStudentDTOById(@PathVariable UUID studentId){
        Optional<StudentDTO> Students= studentService.findStudentDTOById(studentId);
        return Students;
    }
    }

