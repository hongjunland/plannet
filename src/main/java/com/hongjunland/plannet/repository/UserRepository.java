package com.hongjunland.plannet.repository;

import com.hongjunland.plannet.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto, Long> {
    
}
