package com.zelabbas.Module01.ex00;

import java.security.PublicKey;
import java.util.UUID;

public class User {

    private final UUID id;
    private String Name;
    private long Balance;

    public User() {
        this.id = UUID.randomUUID();
        this.Name = "Default";
        this.Balance = 0;
    }

    public User(UUID id, String name, long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.id = id;
        this.Name = name;
        this.Balance = balance;
    }

    // getters:
    public UUID getIdentifier() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public long getBalance() {
        return this.Balance;
    }

    // setters:
    // is the best to let the uid unique
//    public void setIdentifier(int identifier) {
//        this.Identifier = identifier;
//    }

    public void setBalance(long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.Balance = balance;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "User{" + "Identifier=" + id + ", Name=" + Name + ", Balance=" + Balance + '}';
    }

}