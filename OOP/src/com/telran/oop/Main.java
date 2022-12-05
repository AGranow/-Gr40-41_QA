package com.telran.oop;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setDiameter(6);
        System.out.println( circle);
        circle.setRadius(5);
        System.out.println( circle);

        Circle circle1 = new Circle(10, 12);

        Circle circle2 = new Circle(20);

        System.out.println(circle1);
        System.out.println(circle2);
    }
}
