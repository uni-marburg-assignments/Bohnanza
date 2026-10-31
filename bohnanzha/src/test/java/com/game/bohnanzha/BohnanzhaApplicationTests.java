package com.game.bohnanzha;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = BohnanzhaApplication.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class BohnanzhaApplicationTests {



}
