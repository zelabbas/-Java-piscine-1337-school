package com.zelabbas.Module01.ex01;

public class Program {
    public static void main(String[] args) {

        try {
            UserIdsGenerator userIdsGenerator = new UserIdsGenerator();
            User alice = new User(userIdsGenerator.generateId(), "Alice", 1000);
            User bob = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob1 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob2 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob3 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob4 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob5 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob6 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob7 = new User(userIdsGenerator.generateId(), "Bob", 500);
            User bob8 = new User(userIdsGenerator.generateId(), "Bob", 500);

            // Display initial state
            System.out.println(alice);
            System.out.println(bob);
            System.out.println(bob1);
            System.out.println(bob2);
            System.out.println(bob3);
            System.out.println(bob4);
            System.out.println(bob5);
            System.out.println(bob6);
            System.out.println(bob7);
            System.out.println(bob8);

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}