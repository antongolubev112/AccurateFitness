package com.accuratefitness.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class AccurateFitnessController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Accurate Fitness!";
    }

    @GetMapping("/calorie-information")
    public JsonNode getCalorieInformation(JsonNode dailyExerciseInformation){

        return null;
    }

    @PostMapping("/add-calorie-information")
    public void addCalorieInformation(JsonNode dailyExerciseInformation){

    }
}
