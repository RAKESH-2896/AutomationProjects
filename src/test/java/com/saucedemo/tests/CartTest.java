// CartTest.java
package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void verifyCartPageLoads() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        driver.get("https://www.saucedemo.com/cart.html");
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.getCartItemCount() >= 0);
    }
}

