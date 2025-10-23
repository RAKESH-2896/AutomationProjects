// ProductDetailsTest.java
package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsTest extends BaseTest {
    @Test
    public void verifyProductDetails() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
        ProductDetailsPage detailsPage = new ProductDetailsPage(driver);
        Assert.assertFalse(detailsPage.getProductName().isEmpty());
    }
}

