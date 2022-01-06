package com.hongjunland.plannet.service;

import com.hongjunland.plannet.dto.UserDto;
import com.hongjunland.plannet.entity.User;
import com.hongjunland.plannet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow();
        return user.updateUser(userDto);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void login(HttpSession session, String email , String password) {
        User user = userRepository.findByEmail(email);
        if(user==null) throw new RuntimeException("Not Found Account");
        if(user.getEmail().equals(email) && user.getPassword().equals(password)){
            session.setAttribute("user",user);
        }
    }
}
