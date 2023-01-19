package hu.progmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabsTestsWithoutTryCatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();

        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        //launching the specified URL
        driver.get("https://www.saucedemo.com");

        // Test Case 1 START
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        WebElement passwordInputField = driver.findElement(By.id("password"));
        WebElement loginButton =  driver.findElement(By.id("login-button"));
        System.out.println("userNameInputField, passwordInputField and login-button found!");

        userNameInputField.sendKeys("standard_user");
        passwordInputField.sendKeys("secret_sauce");
        loginButton.click();
        // Test Case 1 END

        driver.close();
        driver.quit();
    }
}
