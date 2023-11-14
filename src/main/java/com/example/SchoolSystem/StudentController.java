package com.example.SchoolSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("StudentEntity")



public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping
    public String createStudentEntity(@RequestBody StudentEntity studentEntity){
        return "student saved successfully";

    }
    }

