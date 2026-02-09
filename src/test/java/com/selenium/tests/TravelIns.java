package com.selenium.tests;
import com.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class TravelIns extends Base {
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

@Test
public void check(){
    WebElement travel = driver.findElement(By.xpath("//div[@class='prd-block'][5]"));
    travel.click();
}

}
