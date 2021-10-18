package com.talha.test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Parameters({"emailID", "password"})
    @Test
    public void loginTest(String paramID, String paramPass) throws InterruptedException {
        loginPage.login(paramID, paramPass);
    }
}
