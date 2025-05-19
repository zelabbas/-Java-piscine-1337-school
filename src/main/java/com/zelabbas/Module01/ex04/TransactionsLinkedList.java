package com.zelabbas.Module01.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {

    private List<Transaction> transactions;

    public TransactionsLinkedList() {
        transactions = new ArrayList<>();
    }

    class TransactionNotFoundException extends RuntimeException {

        public TransactionNotFoundException(String message) {
            super(message);
        }
    }


    @Override
    public void addTransaction(Transaction transaction) {
        if (!transactions.contains(transaction)) {
            transactions.add(transaction);
        }
        else {
            System.out.println("this Transaction " +
                    "already exists!");
        }
    }


    @Override
    public Transaction[] getTransactionsToArray() {
        return transactions.toArray(new Transaction[transactions.size()]);
    }


   @Override
   public void removeTransactionByID(UUID transactionId) {
       for (int i = 0; i < transactions.size(); i++) {
           if (transactions.get(i).getId().equals(transactionId)) {
               transactions.remove(i);
               return;
           }
       }
       throw new TransactionNotFoundException("Transaction with ID " + transactionId + " not found.");
   }

    @Override
    public String toString() {
        if (transactions.isEmpty()) {
            return ("the List of Transactions is empty!");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            stringBuilder.append(transaction.toString());
        }
        return stringBuilder.toString();
    }
}