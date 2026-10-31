package com.game.bohnanzha.entity;

import com.game.bohnanzha.enumeration.BeanType;
import com.game.bohnanzha.request.AcceptTradeRequest;
import com.game.bohnanzha.request.TradeRequest;
import jakarta.validation.constraints.Null;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamePlayerTests {

    GamePlayer gamePlayer = new GamePlayer();

    @Mock
    AcceptTradeRequest tradeRequest;

    @Test
    void testGetCardsInHand(){

        List<BeanCard> cardsInHand = Collections.unmodifiableList(new ArrayList<>());
        assertEquals(cardsInHand,gamePlayer.getCardsInHand());
    }


    @Test
    void testOfferTrade(){

        TradeRequest request = new TradeRequest(BeanType.BLACK,BeanType.CHILI);
        gamePlayer.offerTrade(request);
    }


    @Test
    void testAcceptTrade(){

        AcceptTradeRequest request = new AcceptTradeRequest(1,2,3,4,5);
        gamePlayer.acceptTrade(request);
    }


    @Test
    void testEndGame(){

        gamePlayer.quitGame();
    }

}
