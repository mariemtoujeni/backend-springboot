package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.User;

import java.util.List;


public interface IUserService {
    public User addUser(User user);
    public void deleteUser(long id);
    public void updateUser( User user);
    public User getUser(long id);
    public List<User> getAllUser();

    public List<User> getUserByRole(String role);

    public User login(String email, String password);

    public  void uploadFile(String path);
}
