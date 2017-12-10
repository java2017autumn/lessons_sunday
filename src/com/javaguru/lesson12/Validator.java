package com.javaguru.lesson12;

public interface Validator<T> {

    void validate(T t);

    default <T> void assertNotNull(T t) {
        if (t == null) {
            throw new UserValidationException("Cannot be null");
        }
    }

    default void checkStringLength(String field,
                                   String fieldName,
                                   int minLength,
                                   int maxLength) {
        if (field.length() < minLength || field.length() > maxLength) {
            throw new UserValidationException(fieldName + " length out of range");
        }
    }

    class UserValidationException extends RuntimeException {
        UserValidationException(String message) {
            super(message);
        }
    }
}
