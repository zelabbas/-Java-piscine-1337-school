package com.zelabbas.Module01.ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        try {
            User alice = new User(UUID.randomUUID(), "Alice", 1000);
            User bob = new User(UUID.randomUUID(), "Bob", 500);

            // Display initial state
            System.out.println("Before transaction:");
            System.out.println(alice);
            System.out.println(bob);

            // Create a transaction (Alice sends 200 to Bob)
            int transferAmount = 900;
//            Transaction transaction = new Transaction(
//                    alice, bob, transferAmount, Transaction.Category.DEBIT);
            Transaction transaction = new Transaction();

            System.out.println("\nTransaction created:");
            transaction.makeTransaction(transaction.getAmount());
            System.out.println(transaction);

        // Display final state
            System.out.println("\nAfter transaction:");
            System.out.println(alice);
            System.out.println(bob);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}