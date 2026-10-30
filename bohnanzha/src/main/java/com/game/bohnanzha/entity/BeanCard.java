package com.game.bohnanzha.entity;

import com.game.bohnanzha.base.Base;
import com.game.bohnanzha.enumeration.CardPosition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * class skeleton for BeanCard entity
 */

@Entity
@Getter
@Setter
@Table(name = "bean_card")
public class BeanCard extends Base{


    @Column(name = "game_id")
    private int gameId;

    @Column(name = "type")
    private String type;

    @Column(name = "card_location")
    private CardPosition card_location;

    @Column(name = "current_player_id")
    private int currentPlayerId;

    @Column(name = "card_sequence")
    private int cardSequence;


    /**
     * dummy methods for future implementation
     */


    public void startGame(){}

    public void manageTurn(){}

    public void distributeCards(){}

    public void endGame(){}

}
