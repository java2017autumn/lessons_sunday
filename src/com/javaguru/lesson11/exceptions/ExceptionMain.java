package com.javaguru.lesson11.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {
        try {
//            throwCustomerValidation();
//            throwRuntimeException();
            throwException();
        } catch (CustomerValidationException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {

            System.out.println("Finally");
        }

    }

    public static void throwException() throws Exception {
        throw new Exception("Exception...");
    }

    public static void throwRuntimeException() {
        throw new RuntimeException("Runtime Exception...");
    }

    public static void throwCustomerValidation() {
        throw new CustomerValidationException("Customer validation failed");
    }
}
