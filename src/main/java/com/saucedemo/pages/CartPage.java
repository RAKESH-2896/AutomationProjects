// CartPage.java
package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    WebDriver driver;

    @FindBy(className = "cart_item")
    List<WebElement> cartItems;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingBtn;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getCartItemCount() {
        return cartItems.size();
    }

    public void proceedToCheckout() {
        checkoutBtn.click();
    }

    public void continueShopping() {
        continueShoppingBtn.click();
    }
}
