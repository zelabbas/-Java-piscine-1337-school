package com.zelabbas.Module01.ex04;

public class TransactionsService {

    private UserArrayList userstorage;

    public long getBlanceUser(long userId) {
        return userstorage.getUserById(userId).getBalance();
    }



    class IllegalTransactionException extends RuntimeException {

        @Override
        public String toString() {
            return "Illegal Transaction";
        }
    }
}