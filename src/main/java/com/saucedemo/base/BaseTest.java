// BaseTest
package com.saucedemo.base;

import org.testng.annotations.*;
import com.saucedemo.factory.BrowserFactory;
import com.saucedemo.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.getDriver(ConfigReader.getProperty("browser"));
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	}
