package com.hongjunland.plannet.service;

import com.hongjunland.plannet.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User getUserById(Long id);
//    void updateUser(Long id,User user);
    void createUser(User user);
    void deleteUser(Long id);
    List<User> findAll();

}
