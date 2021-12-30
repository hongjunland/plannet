package com.hongjunland.plannet.service;

import com.hongjunland.plannet.model.UserDto;
import com.hongjunland.plannet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(UserDto user) {
        userRepository.save(user);
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll();
    }
}
