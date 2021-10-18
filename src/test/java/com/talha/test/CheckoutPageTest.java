package com.talha.test;


import com.talha.pages.CheckoutPage;
import org.testng.annotations.Test;


public class CheckoutPageTest extends BaseTest {
    @Test
    public void checkoutPageTest () throws InterruptedException {
        System.out.println("This is a test");
        //addToCartTest();
        CheckoutPage.checkoutPage();
        }
    }
