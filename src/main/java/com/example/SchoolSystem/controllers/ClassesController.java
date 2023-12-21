package com.example.SchoolSystem.controllers;
import com.example.SchoolSystem.service.ClassService;
import com.example.SchoolSystem.model.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/classes")
public class ClassesController {
    public ClassService classService;
    @Autowired
    public ClassesController(ClassService classService){
        this.classService=classService;
    }
    @PostMapping("/create")
    public ResponseEntity<Classes> createClass(@RequestBody Classes classes) {
        Classes newClass = classService.createClass(classes);
        return ResponseEntity.ok(classes);
    }}
