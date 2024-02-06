package com.accuratefitness.service;

import com.accuratefitness.model.exercise.Exercise;
import com.accuratefitness.model.exercise.Person;

public class DailyCalorieCalculator implements Calculator {
    private Person person;
    private Exercise[] weeklyExercises;
    private BmrCalculator bmrCalculator;

    public DailyCalorieCalculator(Person person, Exercise[] weeklyExercises) {
        this.person = person;
        this.weeklyExercises = weeklyExercises;
        this.bmrCalculator = new BmrCalculator(person);
    }
    @Override
    public double calculate() {
        return 0;
    }
}
