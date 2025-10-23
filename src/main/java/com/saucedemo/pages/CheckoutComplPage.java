// CheckoutComplPage.java
package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplPage {
    WebDriver driver;

    @FindBy(className = "complete-header")
    WebElement confirmationMsg;

    @FindBy(id = "back-to-products")
    WebElement backHomeBtn;

    public CheckoutComplPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getConfirmationMessage() {
        return confirmationMsg.getText();
    }

    public void goBackHome() {
        backHomeBtn.click();
    }
}

