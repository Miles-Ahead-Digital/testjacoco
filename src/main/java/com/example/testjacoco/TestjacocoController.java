package com.example.testjacoco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestjacocoController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/jacoco")
    public Testjacoco testjacoco(@RequestParam(value = "name", defaultValue = "jacoco") String name) {
        return new Testjacoco(counter.incrementAndGet(), name);
    }
}
