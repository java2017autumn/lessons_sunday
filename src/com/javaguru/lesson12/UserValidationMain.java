package com.javaguru.lesson12;

class UserValidationMain {

    public static void main(String[] args) {
        User user = new User();
        user.setEmail("abc@abc.lv");
        user.setLogin("login");
        user.setPassword(null);
        user.setRepeatPassword("password123");

        UserValidator userValidator = new UserValidator();
        userValidator.addValidator(new LoginValidator());
        userValidator.addValidator(new PasswordValidator());

        userValidator.validate(user);

    }
}
