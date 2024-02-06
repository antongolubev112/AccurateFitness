package com.accuratefitness.service;

import com.accuratefitness.model.exercise.Exercise;
import com.accuratefitness.model.exercise.Running;

import java.util.Objects;

public class ExerciseCalorieCalculator{
    private Exercise exercise;

    public double calculate(Exercise exercise) {
        String exerciseName = exercise.getName();
        if(Objects.equals(exerciseName, "Running")){
            return calculateRunningCalories((Running) exercise);
        }
        return 0;
    }

    private double calculateRunningCalories(Running running){

        return 0;
    }
}
