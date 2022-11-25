package com.QM.app.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @GetMapping("/students/all")
    public List<StudentH2DB> getStudents () {
        return studentservice.getStudents();
    }

}
