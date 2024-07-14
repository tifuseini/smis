package com.sosa.resource;

import com.sosa.model.Student;
import com.sosa.service.StudentService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.Collection;
import java.util.List;

@ApplicationScoped
@Path("/student")
public class StudentResource {

    @Inject
    private StudentService studentService;

    @GET
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

}
