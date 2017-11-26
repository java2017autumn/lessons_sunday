package com.javaguru.lesson10.database;

import com.javaguru.lesson10.domain.User;

import java.util.Optional;

public class DatabaseTest {

    public static void main(String[] args) {
        shouldInsertUser();
        shouldSelectUserById();
    }

    public static void shouldInsertUser() {
        Database database = new DefaultDatabase();
        User testUser = new User();
        testUser.setAge(20);
        testUser.setName("TEST NAME");

        database.insert(testUser);
        printResult("shouldInsertUser", testUser.getId() != null);
    }

    public static void shouldSelectUserById() {
        Database database = new DefaultDatabase();
        User testUser = new User();
        testUser.setAge(20);
        testUser.setName("TEST NAME");

        database.insert(testUser);

        Optional<User> optionalUser = database.selectUserById(testUser.getId());

        printResult("shouldSelectUserById", optionalUser.isPresent());
    }

    public static void printResult(String testName, boolean isSuccess) {
        if (isSuccess) {
            System.out.println(testName + ": Success!");
        } else {
            System.out.println(testName + ": Fail!");
        }

    }
}
