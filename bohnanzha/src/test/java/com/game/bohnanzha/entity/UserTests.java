package com.game.bohnanzha.entity;

import com.game.bohnanzha.dto.UserDTO;
import com.game.bohnanzha.request.LoginRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    User user = new User();
    String token = "";


    @Test
    void testEditUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("testuser");

        UserDTO result = user.editUser(userDTO);

        assertNotNull(result);
        assertEquals(userDTO.getUsername(), result.getUsername());
    }

    @Test
    void testLogin() {
        LoginRequest request = new LoginRequest("franklin","123456");
        assertEquals(token, user.login(request));
    }

    @Test
    void testLogout() {
        user.logout(token);
    }


}
