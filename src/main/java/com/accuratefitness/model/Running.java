package com.accuratefitness.model;

public class Running extends Exercise {
    private double distanceKilometers;
    private double speedKilometersPerHour;
    public Running(double durationMinutes, int averageHeartRate,
                   double distanceKilometers) {
        super("Running", durationMinutes, averageHeartRate);
        this.distanceKilometers = distanceKilometers;
        this.speedKilometersPerHour = this.calculateSpeed(distanceKilometers, durationMinutes);
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
}
