package com.example.SchoolSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    private TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        Teacher newTeacher = teacherService.createTeacher(teacher);
        return ResponseEntity.ok(newTeacher);
    }

    @GetMapping("/one/{teachersId}")
    public Optional<TeacherDTO> findTeacherDTOById(@PathVariable UUID teachersId) {
        Optional<TeacherDTO> Teachers = teacherService.findTeacherDTOById(teachersId);
        return Teachers;
    }
}
