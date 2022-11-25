package com.QM.app.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentH2Config {

    private static final Logger log = LoggerFactory.getLogger(StudentH2DB.class);

    @Bean
    CommandLineRunner initDB(StudentRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new StudentH2DB(
                    "Rizwan Rashid", "rizzywizzy@wow.cool", LocalDate.of(2000, Month.OCTOBER, 8)
            )));
            log.info("Preloading " + repository.save(new StudentH2DB(
                    "Hameed Gayboy", "hamzaboullis@wow.cool", LocalDate.of(2000, Month.SEPTEMBER, 29)
            )));
            log.info("Preloading " + repository.save(new StudentH2DB(
                    "Adem Pleb", "pleb_boy@wow.cool", LocalDate.of(2016, Month.DECEMBER, 24)
            )));
        };
    }
}
