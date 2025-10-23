// CheckoutCompleteTest.java
package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CheckoutComplPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutCompleteTest extends BaseTest {
    @Test
    public void verifyOrderConfirmation() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        driver.get("https://www.saucedemo.com/checkout-complete.html");
        CheckoutComplPage completePage = new CheckoutComplPage(driver);
        Assert.assertTrue(completePage.getConfirmationMessage().contains("THANK YOU"));
    }
}

