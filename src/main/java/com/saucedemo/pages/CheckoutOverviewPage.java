// CheckoutOverviewPage.java
package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
    WebDriver driver;

    @FindBy(className = "summary_total_label")
    WebElement totalPrice;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(id = "cancel")
    WebElement cancelBtn;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void finishCheckout() {
        finishBtn.click();
    }

    public void cancelCheckout() {
        cancelBtn.click();
    }
}

