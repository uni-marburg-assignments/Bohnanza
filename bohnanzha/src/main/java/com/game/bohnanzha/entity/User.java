package com.game.bohnanzha.entity;

import com.game.bohnanzha.base.Base;
import com.game.bohnanzha.dto.UserDTO;
import com.game.bohnanzha.request.AcceptTradeRequest;
import com.game.bohnanzha.request.LoginRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

/**
 * class skeleton for Game entity
 */

@Entity
@Getter
@Setter
@Table(name = "user_details")
public class User extends Base {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    /**
     * dummy methods for future implementation
     */


    public UserDTO editUser(UserDTO userDTO){
        return userDTO;
    }

    public String login(LoginRequest loginRequest){
        return "";
    }

    public void logout(String token){}


}
