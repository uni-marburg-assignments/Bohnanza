package com.game.bohnanzha.entity;

import com.game.bohnanzha.base.Base;
import com.game.bohnanzha.enumeration.BeanType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * class skeleton for Game entity
 */

@Entity
@Getter
@Setter
@Table(name = "game")
public class Game extends Base {


    @Column(name = "active_player_id")
    private int activePlayerId;

    @Column(name = "game_code")
    private String gameCode;

    @Column(name = "players_count")
    private int playersCount;

    @Column(name = "phase")
    private int phase;

    @Column(name = "game_cycle_count")
    private int gameCycleCount;



    /**
     * dummy methods for future implementation
     */


    public boolean canHarvest(){
        return true;
    }

    public boolean canPlant(BeanType type){
        return true;
    }

    public int harvestField(){
        return 0;
    }

    public int plantBean(BeanCard card){
        return 0;
    }


}
