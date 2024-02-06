package com.accuratefitness.model.formula;

import com.accuratefitness.model.exercise.CardioExercise;
import com.accuratefitness.model.exercise.Exercise;
import com.accuratefitness.model.exercise.Running;

import java.util.Objects;

public class MET {
    private double metValue;

    public MET(Exercise exercise) {
        this.METValue = this.calculateMET(exercise);
    }

    private double calculateMET(Exercise exercise) {
        String exerciseName = exercise.getName();
        if(Objects.equals(exerciseName, "Running") || Objects.equals(exerciseName, "Walking")){
            return calculateRunningMET((CardioExercise) exercise);
        }
        return 0;
    }

    private double calculateRunningMET(CardioExercise exercise) {
        double metValue = 0;
        double speed = exercise.getSpeedKilometersPerHour();
        if(speed>0 && speed <=2.7){
            metValue = 2.3;
        } else if(speed>2.7 && speed <=4){
            metValue = 2.9;
        } else if(speed>4 && speed <=4.8){
            metValue = 3.3;
        } else if(speed>4.8 && speed <=5.5){
            metValue = 3.6;
        } else if(speed>5.5 && speed <=6.4){
            metValue = 4.3;
        } else if(speed>6.4 && speed <=7){
            metValue = 5;
        } else if(speed>7){
            metValue = 7;
        }
        return metValue;
    }


}
