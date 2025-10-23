// ProductDetailsPage.java
package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
    WebDriver driver;

    @FindBy(className = "inventory_details_name")
    WebElement productName;

    @FindBy(className = "inventory_details_desc")
    WebElement productDesc;

    @FindBy(className = "inventory_details_price")
    WebElement productPrice;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn;

    @FindBy(id = "back-to-products")
    WebElement backBtn;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProductName() {
        return productName.getText();
    }

    public String getProductDescription() {
        return productDesc.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void addToCart() {
        addToCartBtn.click();
    }

    public void goBackToInventory() {
        backBtn.click();
    }
}

