package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");

            WebElement element = driver.findElement(By.cssSelector("input[id = pass]"));
            WebElement element1 = driver.findElement(By.cssSelector("input#email"));
            element1.sendKeys("Sureshkoli@gmail.com");
            element.sendKeys("123456789");

            WebElement element2 = driver.findElement(By.className("_6ltg"));
            element2.click();
        }
    }
    }

