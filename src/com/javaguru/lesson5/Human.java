package com.javaguru.lesson5;

public class Human {

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello! My name is "
                + getName() + ". I am " + getAge() + " years old.");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Age: " + getAge();
    }
}
