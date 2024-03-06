
package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {

    public  WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod

    public void beforeMethodDemo(String browserName){

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }   else if (browserName.equalsIgnoreCase("Firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Users\\Public\\Desktop\\Firefox.lnk");

            System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
            driver = new FirefoxDriver(firefoxOptions);

        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","C:\\Users\\Hp\\Downloads\\edge driver_win64");
            driver = new EdgeDriver();
        } else
            {
                throw new RuntimeException("Please select correct browser");
            }

    }


    @Parameters({"courseName","cityName"})
    @Test

    public void verifyGoogleSearch(String courseName,String cityName) throws InterruptedException {

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName + cityName);
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();
    }
}
