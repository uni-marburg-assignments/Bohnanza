package com.game.bohnanzha.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String username;
    private String email;
    private String password;
    private String status;

}
