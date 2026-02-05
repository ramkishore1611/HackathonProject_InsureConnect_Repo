package com.selenium.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class TravelIns {
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
@Test
public void check(){
    driver = new ChromeDriver();
    driver.get("https://www.policybazaar.com/");
    WebElement travel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[2]/section/div[7]/a")));


}

}
