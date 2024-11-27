package controller;

import model.User;

public interface UserManagement {
    public boolean addUser(User user);
    public boolean updateUser(String id);
    public boolean deleteUser(String id);
    public boolean showUser() ;
}
