package hu.progmatic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPure {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        //launching the specified URL
        driver.get("https://idokep.hu");
    }
}
