package com.javaguru.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private String surname;
    private Map<String, Integer> grades = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(String subject, int grade) {
        this.grades.put(subject, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + grades +
                '}';
    }
}
