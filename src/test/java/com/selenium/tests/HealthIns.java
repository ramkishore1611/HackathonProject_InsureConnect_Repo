package com.selenium.tests;

import com.selenium.base.Base;
import com.selenium.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

@Listeners(TestListener.class)
public class HealthIns extends Base {

    @Test
    public void Healthcheck() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");

        By bt = By.xpath("//a[@class='view-all view-all-prd']");
        WebElement viewAll = wait.until(ExpectedConditions.elementToBeClickable(bt));
        viewAll.click();

        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[normalize-space(.)='Health Insurance']")));
        WebElement ul = heading.findElement(By.xpath("following-sibling::ul[1]"));

        List<WebElement> lis = ul.findElements(By.xpath(".//li"));
        System.out.println("=== Health Insurance Items ===");
        int count = 1;
        for (WebElement li : lis) {
            String text = li.getText().trim();
            System.out.println(count + ". " +text+" ");
            count++;
        }
    }
}
