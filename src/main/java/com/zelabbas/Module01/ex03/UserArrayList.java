package com.zelabbas.Module01.ex03;


public class UserArrayList implements UserList {
    private User[] users;
    private int index;

    public UserArrayList() {
        users = new User[10]; // Initial capacity of 10
        index = 0;
    }

    // COPY THE OLD ARRAY TO NEW ONE WITH A SIZE : OLDSIZE + OLDSize / 2;
    private void copyArray() {
        User[] newArray = new User[users.length + users.length / 2];
        for (int i = 0; i < users.length; i++) {
            newArray[i] = users[i];
        }
        users = newArray;
    }

    @Override
    public void add(User user) {
        if (user == null) {
            System.err.println("Cannot add null user");
            return;
        }
        if (index >= users.length) {
            copyArray();
        }
        this.users[index++] = user;
    }

    @Override
    public User getUserById(long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Cannot get user from negative id!");
        }

        for (int i = 0; i < index; i++) {
            if (users[i].getIdentifier() == id) {
                return users[i];
            }
        }
        throw new UserExceptionNotFound();
    }

    @Override
    public User getUserByIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Cannot get user from negative index!");
        }

        if (index >= this.index) {
            throw new IllegalArgumentException("Cannot get user from index out of bounds!");
        }

        return this.users[index];
    }

    @Override
    public long getUsersCount() {
        return this.index;
    }

    @Override
    public String toString() {
        if (users == null) {
            return ("the List is empty!");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < index; i++) {

            if (i + 1 >= index) {
                builder.append(users[i].toString() + ".");
            }
            else
                builder.append(users[i].toString() + ", ");
        }
        return builder.toString();
    }
}