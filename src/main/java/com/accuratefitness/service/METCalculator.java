package com.accuratefitness.service;

import com.accuratefitness.model.exercise.CardioExercise;
import com.accuratefitness.model.exercise.Exercise;

import java.util.Objects;

public class METCalculator {
    public METCalculator() {}

    public double calculateMET(Exercise exercise) {
        String exerciseName = exercise.getName();
        if(Objects.equals(exerciseName, "Running") || Objects.equals(exerciseName, "Walking")){
            return calculateRunningMET((CardioExercise) exercise);
        }
        return 0;
    }

    private double calculateRunningMET(CardioExercise exercise) {
        double metValue = 0;
        double speed = exercise.getSpeedKilometersPerHour();
        if(speed <=2){
            metValue=2.0;
        } else if(speed <=3){
            metValue=2.8;
        } else if(speed <=4){
            metValue=3.0;
        } else if(speed <=5){
            metValue=3.8;
        } else if(speed <=6){
            metValue=4.3;
        } else if(speed <=7){
            metValue=4.75;
        } else if(speed <=8){
            metValue=6.0;
        } else if(speed <=9){
            metValue=7.0;
        } else if(speed <=10){
            metValue=8.0;
        } else if(speed <=11){
            metValue=9.0;
        } else if(speed <=12){
            metValue=10.0;
        } else if(speed <=13){
            metValue=10.75;
        } else if(speed <=14){
            metValue=11.5;
        } else if(speed <=15){
            metValue=12.25;
        } else if(speed <=16){
            metValue=13;
        } else {
            metValue = 15.0;
        }
        return metValue;
    }


}
