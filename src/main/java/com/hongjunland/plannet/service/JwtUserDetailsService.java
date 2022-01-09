package com.hongjunland.plannet.service;

import com.hongjunland.plannet.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService {
    @Autowired
    UserService userService;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Optional<User> userOptional = userService.findUserByEmail(email);
        User user = userOptional.orElseThrow(()->new UsernameNotFoundException("user name is not found!"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),new ArrayList<>());
    }
}
