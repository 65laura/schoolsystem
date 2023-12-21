package com.example.SchoolSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/api/students")
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
   @GetMapping("/all")
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        try {
            List<StudentEntity> students = studentService.getAllStudents();
            if (students != null && !students.isEmpty()) {
                return ResponseEntity.ok(students);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/one/{studentId}")
    public ResponseEntity<List<StudentDTO>>findStudentDTOById(@PathVariable UUID studentId) {
        List<StudentDTO> students = studentService.findStudentDTOById(studentId);
        if (students != null && !students.isEmpty()) {
            return ResponseEntity.ok(students);
        } else {
            return ResponseEntity.notFound().build();
        }
    }}



