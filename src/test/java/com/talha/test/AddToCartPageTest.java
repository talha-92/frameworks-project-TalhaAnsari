package com.talha.test;

import org.testng.annotations.Test;

public class AddToCartPageTest extends LoginPageTest {

    @Test
    public void addToCartTest() throws InterruptedException {
        System.out.println("Adding Hot Sauce");
       // loginTest();
        addToCartPage.addtoCart();
    }
}
