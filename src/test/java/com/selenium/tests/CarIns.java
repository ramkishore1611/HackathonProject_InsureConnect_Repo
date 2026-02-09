package com.selenium.tests;

import com.selenium.base.Base;
import com.selenium.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class CarIns extends Base{
    @Test
    public void carcheck(){

    WebElement car = driver.findElement(By.xpath("//div[@class='prd-block'][2]"));
    car.click();
    driver.findElement(By.xpath("//span[contains(@class,'blueTextButton')]")).click();
}}
