package com.telran.oop;

public class Humon {

    private String name;
    private String lastName;
    private int age;

    public Humon(String name1, String lastName, int age) {
        name = name1;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age>0 || age< 100 ){
            this.age = age;
        }
        System.out.println(" Возраст не корректен");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
