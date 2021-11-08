package com.example.demo.student;

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
            Student daniel = new Student(
                    "Daniel",
                    "daniel@test.com",
                    LocalDate.of(1993, Month.APRIL, 10)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@test.com",
                    LocalDate.of(1998, Month.APRIL, 2)
            );
            repository.saveAll(
                    List.of(daniel, alex)
            );
        };
    }
}
