package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dan = new Student(
                    1L,
                    "dan",
                    "needham",
                    LocalDate.now()
            );
            Student steve = new Student(
                    "steve",
                    "needham",
                    LocalDate.now()
            );
            repository.saveAll(List.of(dan, steve));
        };


    }
}
