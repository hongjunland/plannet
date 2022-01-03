
package com.hongjunland.plannet.entity;

import com.hongjunland.plannet.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="USER")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;

    public User updateUser(UserDto dto){
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.name = dto.getName();
        return this;
    }
}
