package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ProductTest extends BaseTest{
    public static JavascriptExecutor js;
    @Test
    public void doTest() throws InterruptedException {

        //random olarak bir ürün seçilir.
        int randomProductIndex = new Random().nextInt(28);
        driver.findElement(By.cssSelector(".products-container > li:nth-child(" + randomProductIndex + ")")).click();

        //seçilen ürün sepete eklenir.
        js = ((JavascriptExecutor) driver);
        js.executeScript("window.scroll(0,550)");
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-basket")).click();

       //Sepete git
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Sepete Git']")).click();

        //Adet Sayısı 2ye çıkarılır.
        Thread.sleep(500);
        driver.findElement(By.cssSelector("select.amount>:nth-child(2)")).click();

        //Sepetten ürün silinir
        Thread.sleep(2000);
       driver.findElement(By.className("btn-delete")).click();

       }
}





