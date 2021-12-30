package com.hongjunland.plannet.controller;

import com.hongjunland.plannet.model.UserDto;
import com.hongjunland.plannet.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "user", description = "사용자 API")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "사용자 등록", description = "사용자의 이메일, 이름, 비밀번호로 등록한다")
    @PostMapping(value = "/user")
    public void createUser(@RequestBody UserDto userDto){
        userService.createUser(userDto);
    }

    @GetMapping(value = "/users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }
//    @GetMapping("/user/{id}")
//    @Operation(summary = "회원 조회" , description = "id를 이용하여 user를 조회")
//    public ResponseEntity<? extends Basic>select(){
//
//    }

}
