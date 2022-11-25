package com.QM.app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
/* UNUSED

@Configuration
public class StudentSQLConfig {

    // Uncomment @Bean to run original SQL DB
    CommandLineRunner initDB(StudentRepository repository) {
        return args -> {
            StudentSQLDB rizwan = new StudentSQLDB(
                    1L,
                    "Rizwan",
                    "rizzywizzybabes@hotmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 8),
                    22
            );
            StudentSQLDB hameed = new StudentSQLDB(
                    "Hameed",
                    "hammed.gayboy@hotmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 24),
                    22
            );
            repository.saveAll(List.of(rizwan, hameed));
        };
    }
}
*/
