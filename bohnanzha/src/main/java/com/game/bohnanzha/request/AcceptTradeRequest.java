package com.game.bohnanzha.request;

import com.game.bohnanzha.enumeration.BeanType;
import jakarta.validation.constraints.NotEmpty;

public record AcceptTradeRequest (
        @NotEmpty int gameId,
        @NotEmpty int cardOffered,
        @NotEmpty int cardRequired,
        @NotEmpty int traderId,
        @NotEmpty int senderId)
{ }
