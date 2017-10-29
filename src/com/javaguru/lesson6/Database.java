package com.javaguru.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private Map<Student, Double> studentAverageGrades = new HashMap<>();

    public Map<Student, Double> getStudentAverageGrades() {
        return studentAverageGrades;
    }
    public void addStudentWithAverageGrade(Student student, double averageGrade) {
        studentAverageGrades.put(student, averageGrade);
    }


    public Double getAverageGradeBy(Student student) {
        return studentAverageGrades.get(student);
    }
    @Override
    public String toString() {
        return "Database{" +
                "studentAverageGrades=" + studentAverageGrades +
                '}';
    }
}
