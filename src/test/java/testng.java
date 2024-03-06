import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class testng {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void testCase1() throws InterruptedException {

        driver.get("https://www.facebook.com/");
        Thread.sleep(400);
    }

    @Test
    public void testCase2() throws InterruptedException {

        driver.get("https://groww.in/stocks/heidelberg-cement-india-ltd");
        Thread.sleep(1000);
    }

    @Test
    public void testCase3() throws InterruptedException {
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
        Thread.sleep(1000);

    }
    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

}
