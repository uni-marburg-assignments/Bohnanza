package com.game.bohnanzha.request;


import com.game.bohnanzha.entity.BeanCard;
import com.game.bohnanzha.enumeration.BeanType;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public record TradeRequest(
        @NotEmpty BeanType cardOffered,
        @NotEmpty BeanType cardRequired)
{ }
