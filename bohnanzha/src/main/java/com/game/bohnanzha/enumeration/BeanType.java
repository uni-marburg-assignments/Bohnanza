package com.game.bohnanzha.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enum representing the bean types in Bohnanza, along with their
 */

@Getter
@RequiredArgsConstructor
public enum BeanType {

    BLUE("Blue Bean", 20, new int[]{4, 6, 8, 10}),
    CHILI("Chili Bean", 18, new int[]{3, 6, 8, 9}),
    STINK("Stink Bean", 16, new int[]{3, 5, 7, 8}),
    GREEN("Green Bean", 14, new int[]{3, 5, 6, 7}),
    SOY("Soybean", 12, new int[]{2, 4, 6, 7}),
    BLACK("Black-eyed Bean", 10, new int[]{2, 4, 5, 6}),
    GARDEN("Garden Bean", 8, new int[]{2, 3}), // Special: only 2 or 3 cards needed for coins
    RED("Red Bean", 6, new int[]{2, 3, 4, 5});

    private final String displayName;
    private final int totalCountInDeck;
    private final int[] thresholds;


}