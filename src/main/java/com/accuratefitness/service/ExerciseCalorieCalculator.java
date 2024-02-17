package com.accuratefitness.service;

import com.accuratefitness.model.exercise.Exercise;
import com.accuratefitness.model.exercise.Running;

import java.util.Objects;

public class ExerciseCalorieCalculator{
    private Exercise exercise;
    private METCalculator metCalculator;

    //constructor
    public ExerciseCalorieCalculator(Exercise exercise){
        this.exercise = exercise;
        this.metCalculator = new METCalculator();
    }

    public double calculate(Exercise exercise) {
        String exerciseName = exercise.getName();
        if(Objects.equals(exerciseName, "Running")){
            return calculateRunningCalories((Running) exercise);
        }
        return 0;
    }

    private double calculateRunningCalories(Running running){
        double metValue = metCalculator.calculateMET(running);
        return 0;
    }
}
