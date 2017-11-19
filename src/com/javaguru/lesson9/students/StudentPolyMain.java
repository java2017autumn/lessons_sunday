package com.javaguru.lesson9.students;

import java.util.ArrayList;
import java.util.List;

public class StudentPolyMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        students.add(student);
        students.add(juniorDeveloper);
        students.add(middleDeveloper);
        students.add(seniorDeveloper);

        Student student1 = new MiddleDeveloper();
        student1.study();

        students.forEach(Student::study);
    }
}
