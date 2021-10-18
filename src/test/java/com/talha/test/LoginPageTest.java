package com.talha.test;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void LoginPageTest() throws InterruptedException {
        System.out.println("This is a login Page");
        loginPage.login();
    }


}
