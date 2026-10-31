package com.game.bohnanzha.entity;

import org.junit.jupiter.api.Test;

public class GameTests {

    Game game = new Game();

    @Test
    void testStartGame() {
        game.startGame();
    }

    @Test
    void testManageTurn() {
        game.manageTurn();
    }

    @Test
    void testDistributeCards() {
        game.distributeCards();
    }

    @Test
    void testEndGame() {
        game.endGame();
    }

}

