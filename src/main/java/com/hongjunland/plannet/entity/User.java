
package com.hongjunland.plannet.entity;

import com.hongjunland.plannet.dto.UserDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="USER")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
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
