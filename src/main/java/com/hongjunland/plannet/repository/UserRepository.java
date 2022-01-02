package com.hongjunland.plannet.repository;
import com.hongjunland.plannet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
