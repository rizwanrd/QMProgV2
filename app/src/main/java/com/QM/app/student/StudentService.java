package com.QM.app.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents () {
        return List.of(
                new Student(
                        1L,
                        "Rizwan",
                        "rizzywizzybabes@hotmail.com",
                        LocalDate.of(2000, Month.OCTOBER, 8),
                        22
                )
        );
    }

}
