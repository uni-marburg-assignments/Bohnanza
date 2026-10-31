package com.game.bohnanzha.entity;

import com.game.bohnanzha.enumeration.BeanType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeanFieldTests {

    BeanField beanField = new BeanField();

    @Test
    void testCanHarvest() {
        assertTrue(beanField.canHarvest());
    }

    @Test
    void testCanPlant() {
        assertTrue(beanField.canPlant(BeanType.BLACK));
    }

    @Test
    void testHarvestField() {
        assertEquals(0, beanField.harvestField());
    }

    @Test
    void testPlantBean() {
        assertEquals(0, beanField.plantBean(new BeanCard()));
    }

}

