package com.javaguru.lesson10.service;

import com.javaguru.lesson10.database.Database;
import com.javaguru.lesson10.database.DefaultDatabase;
import com.javaguru.lesson10.domain.User;

public class UserServiceTest {

    public static void main(String[] args) {
        shouldAddUser();
        shouldNotGetUserById();
    }

    private static void shouldAddUser() {
        Database database = new DefaultDatabase();
        UserService userService = new UserService(database);
        User user = new User();
        user.setAge(20);
        user.setName("Ed");

        userService.addUser(user);

        printResult("shouldAddUser", user.getId() != null);
    }

    private static void shouldNotGetUserById() {
        Database database = new DefaultDatabase();
        UserService userService = new UserService(database);
        User user = new User();
        user.setAge(20);
        user.setName("Ed");
        userService.addUser(user);

        User selectedUser = userService.getUser(-1L);
        printResult("shouldNotGetUserById", selectedUser == null);
    }

    private static void printResult(String testName, boolean isSuccess) {
        if (isSuccess) {
            System.out.println(testName + ": Success!");
        } else {
            System.out.println(testName + ": Fail!");
        }
    }

}
