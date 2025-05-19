package com.zelabbas.Module01.ex04;

public interface UserList {
    public void add(User user);
//    public void remove(User user); // to add it later does not required
    public User getUserById(long id);
    public User getUserByIndex(int index);
    public long getUsersCount();
}