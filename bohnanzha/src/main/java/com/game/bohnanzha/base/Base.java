package com.game.bohnanzha.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.io.Serial;
import java.io.Serializable;


/**
 * base template for all entity classes
 * includes id which is a primary key, has generation type identity
 * and status which is a dynamic string value depends on the main entity class
 */

@MappedSuperclass
@Getter
@Setter
public abstract class Base implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private String status;


}
