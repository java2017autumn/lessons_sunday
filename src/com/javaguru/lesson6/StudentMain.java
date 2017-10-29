package com.javaguru.lesson6;

public class StudentMain {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setName("Vasya");
        firstStudent.setSurname("Pupkin");
        firstStudent.addGrade("Sport" , 5);
        firstStudent.addGrade("Math" , 7);
        firstStudent.addGrade("English" , 3);
        System.out.println(firstStudent);

        Database database = new Database();
        database.addStudentWithAverageGrade(firstStudent, 5);
        System.out.println(database);

        Student secondStudent = new Student();
        secondStudent.setName("Vasya");
        secondStudent.setSurname("Pupkin");
        Double averageGrade = database.getAverageGradeBy(secondStudent);

        System.out.println(averageGrade);
    }
}
