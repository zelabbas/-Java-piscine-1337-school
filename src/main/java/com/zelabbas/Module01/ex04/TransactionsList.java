package com.zelabbas.Module01.ex04;

import java.util.UUID;
public interface TransactionsList {

    // add a Transaction
    public void addTransaction(Transaction transaction);

    // remove a Transaction by id
    public void removeTransactionByID(UUID transactionId);

    // get all transactions so form array
    public Transaction[] getTransactionsToArray();
}