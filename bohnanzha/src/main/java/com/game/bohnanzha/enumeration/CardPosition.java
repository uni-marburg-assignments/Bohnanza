package com.game.bohnanzha.enumeration;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CardPosition {

    DRAW_PILE("In the face-down draw deck waiting to be drawn"),
    DISCARD_PILE("In the face-up discard pile"),
    HAND("In a player's hand (subject to strict FIFO ordering)"),
    PLANTED_FIELD("Planted on a player's BeanField mat"),
    TRADE_AREA("Temporarily placed in the trade/offer area during phase 2");

    private final String description;
}
