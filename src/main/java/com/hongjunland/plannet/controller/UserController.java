package com.hongjunland.plannet.controller;

import com.hongjunland.plannet.dto.UserDto;
import com.hongjunland.plannet.entity.User;
import com.hongjunland.plannet.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "user", description = "사용자 API")
@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "사용자 등록", description = "사용자의 이메일, 이름, 비밀번호로 등록한다")
    @PostMapping(value = "/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping("/user/{id}")
    @Operation(summary = "회원 조회" , description = "id를 이용하여 user를 조회")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping(value = "/users")
    @Operation(summary = "회원 전체 조회" , description = "user 전체 목록 조회")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping("/user/{id}")
    @Operation(summary = "회원 정보 수정", description = "user 내용 수정")
    @ResponseStatus(HttpStatus.CREATED)
    public User modifyUser(@PathVariable Long id, @RequestBody UserDto user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/user/{id}")
    @Operation(summary = "회원 삭제", description = "user 삭제")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
