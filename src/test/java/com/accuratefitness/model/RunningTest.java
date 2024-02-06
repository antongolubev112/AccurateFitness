package com.accuratefitness.model;

import com.accuratefitness.model.exercise.Running;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RunningTest {
    @Test
    public void testCalculateSpeed() {
        // Arrange
        double distance = 10.0;
        double duration = 60.0;
        double expectedSpeed= 10.0;

        Running running = new Running(duration, 150, distance);
        assertEquals(expectedSpeed, running.getSpeedKilometersPerHour(), 0.001);
    }
}

