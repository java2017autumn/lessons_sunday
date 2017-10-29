package com.javaguru.lesson6;

public class StudentMain {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setName("Vasya");
        firstStudent.setSurname("Pupkin");
        firstStudent.addGrade("Sport" , 5);
        System.out.println(firstStudent);


    }
}
