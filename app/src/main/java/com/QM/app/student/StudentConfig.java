package com.QM.app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rizwan = new Student (
                    1L,
                    "Rizwan",
                    "rizzywizzybabes@hotmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 8),
                    22
            );
            Student hameed = new Student (
                    "Hameed",
                    "hammed.gayboy@hotmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 24),
                    22
            );
            repository.saveAll(List.of(rizwan, hameed));
        };
    }
}
