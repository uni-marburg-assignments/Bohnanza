package com.game.bohnanzha.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeanCardTests {

    BeanCard beanCard = new BeanCard();

    @Test
    void testGetLastSequence() {
        assertEquals(0, beanCard.getLastSequence(null));
    }

    @Test
    void testAddCardToDeck() {
        beanCard.addCardToDeck(null);
    }

}

