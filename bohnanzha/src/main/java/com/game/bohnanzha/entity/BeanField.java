package com.game.bohnanzha.entity;

import com.game.bohnanzha.base.Base;
import com.game.bohnanzha.enumeration.BeanType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * class skeleton for BeanField entity
 */

@Entity
@Getter
@Setter
@Table(name = "bean_Field")
public class BeanField extends Base {


    @Column(name = "player_id")
    private int playerId;

    @Column(name = "type")
    private BeanType beanType;

    @Column(name = "bean_count")
    private int beanCount;


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
