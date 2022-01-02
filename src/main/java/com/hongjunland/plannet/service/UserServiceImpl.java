package com.hongjunland.plannet.service;

import com.hongjunland.plannet.model.User;
import com.hongjunland.plannet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

//    @Override
//    public void updateUser(Long id, User user) {
//        Optional<User> lagacyUser = userRepository.findById(id);
//        lagacyUser
//        userRepository.save(user);
//    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
