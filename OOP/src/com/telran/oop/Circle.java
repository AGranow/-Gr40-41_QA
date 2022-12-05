package com.telran.oop;

public class Circle {

    private double radius;
    private double diameter;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter/2;
    }

    @Override
    public String toString() {
        return "Переопредели меня - сделай красиво";
    }
}
