package com.javaguru.lesson9;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        System.out.println();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.writeCode();
        juniorDeveloper.study();

        System.out.println();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.debug();
        middleDeveloper.study();
        middleDeveloper.writeCode();

        System.out.println();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.study();
        seniorDeveloper.writeCode();
        seniorDeveloper.debug();
        seniorDeveloper.solveProblems();
    }
}
