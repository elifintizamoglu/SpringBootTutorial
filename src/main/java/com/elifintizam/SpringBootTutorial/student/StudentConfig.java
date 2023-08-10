package com.elifintizam.SpringBootTutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maria = new Student(
                    "Maria Hwan",
                    "maria@gmail.com",
                    LocalDate.of(2000, JANUARY, 7),
                    23
            );
            Student john = new Student(
                    "John Hwan",
                    "john@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 5),
                    21
            );
            repository.saveAll(List.of(maria,john));
        };
    }
}
