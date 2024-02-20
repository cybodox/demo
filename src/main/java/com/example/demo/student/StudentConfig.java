package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student sasuke = new Student(
                    "sasuke",
                    "uchiha.sasuke@gmail.com",
                    LocalDate.of(2002, DECEMBER, 13)

            );
            Student itachi = new Student(
                    "itachi",
                    "uchiha.itachi@gmail.com",
                    LocalDate.of(2000, NOVEMBER, 04)

            );

            repository.saveAll(
                    List.of(sasuke, itachi)
            );

        };
    }
}
