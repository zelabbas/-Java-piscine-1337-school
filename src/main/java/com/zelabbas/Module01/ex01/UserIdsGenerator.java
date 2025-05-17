package com.zelabbas.Module01.ex01;

public class UserIdsGenerator {
    private static long id = 0;
    private static byte numberObject = 0;

    public UserIdsGenerator() {
        if (numberObject > 1) {
            throw new RuntimeException("You can't create more than one object UserIdsGenerator id!");
        }
        numberObject++;
    }

    public static UserIdsGenerator getInstance() {
        return new UserIdsGenerator();
    }

    public long generateId() {
        id++;
        return (id);
    }
}
