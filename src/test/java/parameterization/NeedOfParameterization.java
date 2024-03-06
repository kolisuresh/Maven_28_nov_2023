package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    String courseName = "Selenium";
    String cityName = "Pune";
    @Test
    public void verifyGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Selenum" + "pune");
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();
    }
//    @Test
//
//    public void verifyGoogleSearch_2(String courseName,String cityName) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.co.in/");
//        driver.manage().window().maximize();
//
//        WebElement googleSearchBox = driver.findElement(By.name("q"));
//        googleSearchBox.sendKeys( courseName+ cityName);
//        googleSearchBox.sendKeys(Keys.ENTER);
//
//        Thread.sleep(4000);
//        driver.close();
//    }
}
