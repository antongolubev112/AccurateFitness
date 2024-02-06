package com.accuratefitness.service;

import com.accuratefitness.model.exercise.Person;
import com.accuratefitness.model.enums.Gender;

public class BmrCalculator implements Calculator {
    private final Person person;

    public BmrCalculator(Person person) {
        this.person = person;
    }

    @Override
    public double calculate() {
        if(person.getLeanBodyMass() != 0.0){
            return calculateKatchMcArdle(person);
        } else{
            return calculateMiffinStJeor(person);
        }
    }

    private double calculateKatchMcArdle(Person person){
        double weight = person.getWeight();
        double bodyFatPercentage = person.getBodyFatPercentage();
        return 370 + (21.6 * (weight - (weight * (bodyFatPercentage / 100))));
    }

    private double calculateMiffinStJeor(Person person){
        double weight = person.getWeight();
        double height = person.getHeight();
        int age = person.getAge();
        Gender gender = person.getGender();

        if(gender == Gender.FEMALE){
            return (10 * weight) + (6.25 * height) - (5 * age) - 161;
        } else{
            return (10 * weight) + (6.25 * height) - (5 * age) + 5;
        }
    }
}
