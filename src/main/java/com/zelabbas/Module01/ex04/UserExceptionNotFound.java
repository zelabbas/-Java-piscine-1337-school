package com.zelabbas.Module01.ex04;

public class UserExceptionNotFound extends RuntimeException {

    @Override
    public String toString() {
        return "User Not Found";
    }
}