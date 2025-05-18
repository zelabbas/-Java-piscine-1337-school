package com.zelabbas.Module01.ex03;

public class UserIdsGenerator {
    private static long id = 0;
    private static UserIdsGenerator object = null;

    public UserIdsGenerator() {
        System.out.println("Initializing UserIdsGenerator");
    }

    public static UserIdsGenerator getInstance() {
        if (object == null) {
            object = new UserIdsGenerator();
        }
        return object;
    }

    public long generateId() {
        id++;
        return (id);
    }
}
