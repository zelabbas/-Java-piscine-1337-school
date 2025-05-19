package com.zelabbas.Module01.ex04;

import java.util.UUID;

public class Transaction {

    public enum Category {
        DEBIT, CREDIT
    }


    private final UUID id;
    private User sender;
    private User recipient;
    private long amount;
    private Category category;

    Transaction() {
        id = UUID.randomUUID();
        amount = 0;
    }

    Transaction(User sender, User recipient, long amount, Category category) {
        this.id = UUID.randomUUID();
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.category = category;
    }

    // Getters:
    public UUID getId() {
        return this.id;
    }

    public User getSender() {
        return this.sender;
    }

    public User getRecipient() {
        return this.recipient;
    }

    public long getAmount() {
        return this.amount;

    }

    // setters
    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setAmount(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater than or equal to zero");
        }
        this.amount = amount;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void makeTransaction(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater than or equal to zero");
        }

        if (sender == null || recipient == null) {
            throw new IllegalArgumentException("Sender and recipient must be set");
        }

        if (sender.getBalance() < amount) {
            throw new IllegalArgumentException("the balance you have not enough money");
        }

        sender.setBalance(sender.getBalance() - amount);
        recipient.setBalance(recipient.getBalance() + amount);

        System.out.println("the transaction is done!");
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction { " + id + ", Sender=" + sender + ", Recipient=" + recipient + ", Amount=" + amount + ", category=" + category + " }";
    }
}