package com.talha.test;

import org.testng.annotations.Test;

public class RegistrationPagetestTwo extends BaseTest{

    @Test(priority=1)
    public void registrationTest() throws InterruptedException {
        registrationPage.registerAccount();

    }

    @Test(priority=2)
    public void logInTest() throws InterruptedException {
        loginPage.login();
    }
}
