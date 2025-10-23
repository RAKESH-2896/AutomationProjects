package com.saucedemo.listeners;

import com.saucedemo.utils.ScreenshotUtil;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.openqa.selenium.WebDriver;

public class ScreenshotListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();
        WebDriver driver = ((com.saucedemo.base.BaseTest) testInstance).driver;
        ScreenshotUtil.captureScreenshot(driver, "screenshots/" + result.getName() + ".png");
    }
}


