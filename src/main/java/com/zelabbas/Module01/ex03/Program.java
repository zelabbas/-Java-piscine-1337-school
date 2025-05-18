package com.zelabbas.Module01.ex03;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        TransactionsLinkedList transactionList = new TransactionsLinkedList();
        UserArrayList userArrayList = new UserArrayList();


        User u1 = new User("zak", 500);
        User u2 = new User("tkannane", 400);
        User u3 = new User("zechi", 300);
        User u4 = new User("saim", 200);

        userArrayList.add(u1);
        userArrayList.add(u2);
        userArrayList.add(u3);
        userArrayList.add(u4);

        System.out.println(userArrayList);

        Transaction transaction1 = new Transaction(u1, u2, 1000, Transaction.Category.DEBIT);
        Transaction transaction2 = new Transaction(u2, u1, 200, Transaction.Category.CREDIT);
        Transaction transaction3 = new Transaction(u3, u4, 300, Transaction.Category.DEBIT);

        transactionList.addTransaction(transaction1);
        transactionList.addTransaction(transaction2);
        transactionList.addTransaction(transaction3);

        try {
            Transaction[] transactions = transactionList.getTransactionsToArray();
            UUID Id;
            for (int i = 0; i < transactions.length; i++) {
                try {
                    transactions[i].makeTransaction(transactions[i].getAmount());
                }catch (Exception e) {
                    Id = transactions[i].getId();
                    System.out.println("Transaction id: " + transactions[i].getId() + " can't be done reason -> " + e.getMessage());
                    transactionList.removeTransactionByID(Id);
                }
            }

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }



        System.out.println(transactionList);
    }
}
