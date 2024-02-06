package com.accuratefitness.model.exercise;

public abstract class CardioExercise extends Exercise {
    private double distanceKilometers;
    private double speedKilometersPerHour;
    private double minPerKm;
    public CardioExercise(String name, double durationMinutes, int averageHeartRate,
                   double distanceKilometers) {
        super(name, durationMinutes, averageHeartRate);
        this.distanceKilometers = distanceKilometers;
        this.speedKilometersPerHour = this.calculateSpeed(distanceKilometers, durationMinutes);
        this.minPerKm = this.calculateMinPerKm(distanceKilometers, durationMinutes);
    }

    private double calculateMinPerKm(double distanceKilometers, double durationMinutes) {
        if (distanceKilometers != 0) {
            return durationMinutes / distanceKilometers;
        } else {
            return 0.0;
        }
    }

    private double calculateSpeed(double distance, double duration) {
        if (duration != 0) {
            return distance / (duration / 60.0); // Convert duration to hours
        } else {
            return 0.0;
        }
    }

    public double getDistanceKilometers() {
        return distanceKilometers;
    }

    public void setDistanceKilometers(double distanceKilometers) {
        this.distanceKilometers = distanceKilometers;
    }

    public double getSpeedKilometersPerHour() {
        return speedKilometersPerHour;
    }

    public void setSpeedKilometersPerHour(double speedKilometersPerHour) {
        this.speedKilometersPerHour = speedKilometersPerHour;
    }

    public double getMinPerKm() {
        return minPerKm;
    }

    public void setMinPerKm(double minPerKm) {
            this.minPerKm = minPerKm;
    }
}

