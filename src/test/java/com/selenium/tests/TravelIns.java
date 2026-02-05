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
    driver.manage().window().maximize();
    driver.get("https://www.policybazaar.com/");
    WebElement travel = driver.findElement(By.xpath("//div[@class='prd-block'][5]"));
    travel.click();
    WebElement country = wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"country\"]"))));
    country.sendKeys("France");
    WebElement date = driver.findElement(By.cssSelector("#newPq_mainWrapper > section > section.newPq_formSections > article.newPq_duration_wrap > div:nth-child(1)"));
    date.click();

}

}
