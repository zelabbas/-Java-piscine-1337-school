package com.zelabbas.Module01.ex02;

public class UserExceptionNotFound extends RuntimeException {

    @Override
    public String toString() {
        return "User Not Found";
    }
}