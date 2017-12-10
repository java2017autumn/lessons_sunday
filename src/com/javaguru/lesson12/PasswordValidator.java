package com.javaguru.lesson12;

class PasswordValidator implements Validator<User> {
    @Override
    public void validate(User user) {
        assertNotNull(user.getPassword());
        checkStringLength(user.getPassword(), "Password", 8, 30);
    }

}
