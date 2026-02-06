package com.selenium.utility;

import com.selenium.base.Base;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((Base) testClass).driver;

        ScreenshotUtil.captureScreenshot(driver, result.getName());
        System.out.println("Screenshot captured for failed test: " + result.getName());
    }
}
