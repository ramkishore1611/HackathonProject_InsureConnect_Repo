package com.selenium.base;

import com.selenium.utility.BrowserDriverSelection;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Base {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = BrowserDriverSelection.getDriver("chrome");
        driver.get("https://www.policybazaar.com/");
    }
    @AfterMethod
    public void tearDown()
    { if (driver != null)
    { driver.quit(); }
    }
}
