package com.game.bohnanzha.request;

import jakarta.validation.constraints.NotEmpty;


/**
 * login request for user
 */

public record LoginRequest(
        @NotEmpty String username,
        @NotEmpty String password)
{ }