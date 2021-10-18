package com.talha.test;

import com.talha.pages.AddToCartPage;
import com.talha.pages.CheckoutPage;
import com.talha.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckoutPageTestTwo extends BaseTest{
    @Test(priority=1)
    public void registrationTest() throws InterruptedException {
        registrationPage.registerAccount();

    }

    @Test(priority=2)
    public void logInTest(LoginPage logInPage) throws InterruptedException {
        logInPage.login();
    }

    @Test(priority=3)
    public void AddToCartPageTest(AddToCartPage addToCartPage) throws InterruptedException {
        addToCartPage.addtoCart();
    }
    @Test(priority = 4)
    public void CheckoutPageTest(CheckoutPageTest checkoutPageTest) throws InterruptedException {
        CheckoutPage.checkoutPage();
    }
}
