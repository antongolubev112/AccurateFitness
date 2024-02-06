package com.accuratefitness.model.exercise;

import com.accuratefitness.model.exercise.CardioExercise;

public class Running extends CardioExercise {
    public Running(double durationMinutes, int averageHeartRate, double distanceKilometers) {
        super("Running", durationMinutes, averageHeartRate, distanceKilometers);
    }
}
