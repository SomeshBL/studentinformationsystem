package com.studentinformation.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.studentinformation"})
@EnableJpaRepositories(basePackages ={"com.studentinformation.dao.student"})
@EntityScan(basePackages={"com.studentinformation.domain.student"})
public class StudentInformationBoot {
    public static void main(String [] argv){
        SpringApplication.run(StudentInformationBoot.class, argv);
    }
}
