package hu.progmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();

        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        //launching the specified URL
        driver.get("https://idokep.hu");
        //Locating the elements using name locator for the text box
        WebElement acceptCookieButton = driver.findElement(By.xpath("//*[contains(text(),'OK, TOVÁBB')]"));

        wait.until(ExpectedConditions.visibilityOf(acceptCookieButton));
        acceptCookieButton.click();

        WebElement radarMenu = driver.findElement(By.xpath("//*[contains(text(),'Radar')]"));
        radarMenu.click();

        driver.close();
    }
}
