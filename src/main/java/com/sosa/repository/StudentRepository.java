package com.sosa.repository;

import com.sosa.model.Student;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

public interface StudentRepository extends PanacheRepository<Student> {

    List<Student> findByName(String name);
}
