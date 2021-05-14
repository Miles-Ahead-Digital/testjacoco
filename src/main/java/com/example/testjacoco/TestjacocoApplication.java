package com.example.testjacoco;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestjacocoApplication {

    @Generated  // excluded from Jacoco Code Coverage
    public static void main(String[] args) {
        SpringApplication.run(TestjacocoApplication.class, args);
    }

}
