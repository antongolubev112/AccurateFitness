package com.accuratefitness.model.exercise;

import com.accuratefitness.model.enums.Gender;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    private Gender gender;
    private double bodyFatPercentage= 0.0;
    private double leanBodyMass;

    // Constructor
    public Person(String name, int age, double weight, double height, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    // constructor with body fat percentage
    public Person(String name, int age, double weight, double height, Gender gender, double bodyFatPercentage) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.bodyFatPercentage = bodyFatPercentage;
        this.leanBodyMass = this.calculateLeanBodyMass();
    }

    private double calculateLeanBodyMass(){
        return weight * (1 - (bodyFatPercentage / 100));
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getLeanBodyMass() {
        return leanBodyMass;
    }

    public void setLeanBodyMass(double leanBodyMass) {
        this.leanBodyMass = leanBodyMass;
    }

    public double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }
}
