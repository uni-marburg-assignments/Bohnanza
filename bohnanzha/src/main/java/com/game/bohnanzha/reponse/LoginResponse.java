package com.game.bohnanzha.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    @JsonProperty("access_token")
    private String accessToken;

}
