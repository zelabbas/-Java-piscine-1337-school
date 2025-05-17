package com.zelabbas.Module01.ex02;

import com.zelabbas.Module01.ex02.User;

public class Program {

    public static void main(String[] args) {

        try {

            UserArrayList list = new UserArrayList();
            User alice = new User("Alice", 1000);
            User bob = new User("Bob", 500);
            User bob2 = new User("Bob", 500);
            User bob1 = new User("Bob", 500);
            User bob3 = new User("Bob", 500);
            list.add(alice);
            list.add(bob);
            list.add(bob2);
            list.add(bob1);
            list.add(bob3);

            System.out.println("LIST->: " + list);


            // Display initial state
            try {
                User findUser = list.getUserById(6);
                System.out.println(findUser);
            }catch (UserExceptionNotFound e) {
                System.out.println(e);
            }


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}