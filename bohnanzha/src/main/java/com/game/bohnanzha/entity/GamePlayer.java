package com.game.bohnanzha.entity;

import com.game.bohnanzha.base.Base;
import com.game.bohnanzha.request.AcceptTradeRequest;
import com.game.bohnanzha.request.TradeRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.Collections;
import java.util.List;


/**
 * class skeleton for Game entity
 */

@Entity
@Getter
@Setter
@Table(name = "game_player")
public class GamePlayer extends Base {


    @Column(name = "user_id")
    private int userId;

    @Column(name = "game_id")
    private int gameId;

    @Column(name = "player_sequence")
    private int playerSequence;

    @Column(name = "coins_earned")
    private int coinsEarned;

    private List<BeanCard> cardsInHand;

    /**
     * dummy methods for future implementation
     */

    public List<BeanCard> getCardsInHand(){
        return Collections.unmodifiableList(cardsInHand);
    }

    public void offerTrade(TradeRequest tradeRequest){}

    public void acceptTrade(AcceptTradeRequest acceptTradeRequest){}

    public void quitGame(){}

}
