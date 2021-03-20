package tests;

import org.junit.Test;

public class MainTest extends BaseDriver {
    @Test
    public void tests() throws InterruptedException {
        new LoginTest().doTest();
        new SearchTest().doTest();
        new ProductTest().doTest();
    }
}
