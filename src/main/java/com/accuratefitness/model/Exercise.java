package com.accuratefitness.model;

public abstract class Exercise {
    private String name;
    private double durationMinutes;
    private int averageHeartRate;

    public Exercise(String name, double durationMinutes, int averageHeartRate) {
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.averageHeartRate = averageHeartRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(double durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }
}
