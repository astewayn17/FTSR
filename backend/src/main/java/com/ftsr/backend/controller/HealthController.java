package com.ftsr.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/test")
    public String testGet() {
        return "Get to /api/test";
    }

    @PostMapping("/test")
    public String testPost() {
        return "POST to /api/test";
    }

    @PutMapping("/test")
    public String testPut() {
        return "PUT to /api/test";
    }

    @DeleteMapping("/test")
    public String testDelete() {
        return "DELETE to /api/test";
    }

    // This method handles GET, POST, PUT, and DELETE
    @RequestMapping(value = "/test_plus", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public String test() {
        return "Request received";
    }
}