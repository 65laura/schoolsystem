package com.example.SchoolSystem.service.impl;

import com.example.SchoolSystem.model.Teacher;
import com.example.SchoolSystem.TeacherDTO;
import com.example.SchoolSystem.repositories.TeacherRepository;
import com.example.SchoolSystem.service.TeacherService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Optional<TeacherDTO> findTeacherDTOById(UUID teachersId) {
        return teacherRepository.findTeacherDTOById(teachersId);}
}
