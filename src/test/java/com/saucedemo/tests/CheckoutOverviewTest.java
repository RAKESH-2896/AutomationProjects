// CheckoutOverviewTest.java
package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CheckoutOverviewPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutOverviewTest extends BaseTest {
    @Test
    public void verifyTotalPrice() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
        Assert.assertTrue(overviewPage.getTotalPrice().contains("Total"));
    }
}

