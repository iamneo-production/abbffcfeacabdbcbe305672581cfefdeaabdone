package com.examly.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.sprin
@Configuration
@ComponentScan(base)
public class AppConfig {
    @Bean
    public Student student(){
        Student student = new Student();
        return student;
    }
}
