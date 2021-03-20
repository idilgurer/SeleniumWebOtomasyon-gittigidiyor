package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SearchTest extends BaseTest {
    public static JavascriptExecutor js;
    @Test
    public void doTest() {

        WebElement searchElement = driver.findElement(By.xpath("//input[@type='text']"));
        searchElement.click();
        searchElement.clear();
        searchElement.sendKeys("Bilgisayar");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.linkText("2")).click();

        }
    }



