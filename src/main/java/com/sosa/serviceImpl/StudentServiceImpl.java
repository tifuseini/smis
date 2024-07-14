package com.sosa.serviceImpl;

import com.sosa.model.Student;
import com.sosa.repository.StudentRepository;
import com.sosa.service.StudentService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {

        return (List<Student>) studentRepository.findAll();
    }
}
