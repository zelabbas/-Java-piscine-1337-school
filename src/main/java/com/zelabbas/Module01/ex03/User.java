package com.zelabbas.Module01.ex03;

public class User {

    private final long id;
    private String Name;
    private long Balance;

    public User() {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.Name = "Default";
        this.Balance = 0;
    }

    // when you use this make sure to use  UserIdsGenerator.getInstance().generateId() in failed id !
    public User(String name, long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.id = UserIdsGenerator.getInstance().generateId();
        this.Name = name;
        this.Balance = balance;
    }

    // getters:
    public long getIdentifier() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public long getBalance() {
        return this.Balance;
    }

    // setters:
    // is the best to not modifie the id to make sure is unique
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