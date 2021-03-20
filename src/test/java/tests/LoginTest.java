package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    @Test
    public void doTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(1000);
        driver.get(loginUrl);


        setById("L-UserNameField", "idil1010@outlook.com.tr");
        setById("L-PasswordField", "projeOdevi123");
        clickBy(By.xpath("//input[@type='submit']"));
    }
}
