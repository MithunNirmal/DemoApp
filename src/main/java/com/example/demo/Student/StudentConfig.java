package com.example.demo.Student;

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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
             Student mithun = new Student(
                    "Mithun",
                    "mithun@gamil.com",
                    LocalDate.of(1998, JULY, 25)
            );

            Student nirmal = new Student(
                    "nirmal",
                    "nirmal@gamil.com",
                    LocalDate.of(2000, JUNE, 20)
            );
            repository.saveAll(List.of(mithun, nirmal));
        };
    }

}
