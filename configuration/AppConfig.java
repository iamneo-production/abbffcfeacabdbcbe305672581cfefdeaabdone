package com.examly.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(com.examly.springapp)
public class AppConfig {
    @Bean
    public Student student(){
        Student student = new Student();
        return student;
    }
}
