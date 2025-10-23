// CheckoutInfoTest.java
package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CheckoutInfoPage;
import com.saucedemo.pages.LoginPage;
import org.testng.annotations.Test;

public class CheckoutInfoTest extends BaseTest {
    @Test
    public void fillCheckoutInformation() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
        CheckoutInfoPage infoPage = new CheckoutInfoPage(driver);
        infoPage.fillCheckoutInfo("John", "Doe", "12345");
        infoPage.continueCheckout();
    }
}
