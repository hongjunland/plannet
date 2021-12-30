package com.hongjunland.plannet.service;

import com.hongjunland.plannet.model.UserDto;

import java.util.List;

public interface UserService {
    public void createUser(UserDto user);
    public List<UserDto> findAll();
}
