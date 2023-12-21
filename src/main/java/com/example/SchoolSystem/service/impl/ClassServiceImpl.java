package com.example.SchoolSystem.service.impl;
import com.example.SchoolSystem.model.Classes;
import com.example.SchoolSystem.repositories.ClassesRepository;
import com.example.SchoolSystem.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    public ClassesRepository classesRepository;
        @Override
        public Classes createClass(Classes classes) {
            try {
                Classes newClass = classesRepository.save(classes);
                return newClass;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    }
