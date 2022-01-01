
package com.hongjunland.plannet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="USER")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String name;

}
