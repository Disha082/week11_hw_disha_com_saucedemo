import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        //1)Setup firefox Browser
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gheko.driver" , "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2)Open Url
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //4)Print the current url
        System.out.println("Current Url: "+ driver.getCurrentUrl());

        //5)print the page source
        System.out.println("Page source: "+ driver.getPageSource());

        //6)Enter the username to username field
        WebElement userfield = driver.findElement(By.name("user-name"));
        userfield.sendKeys("eudhey");

        //7)Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("udsgjd12547");

        //8)Close the browser
        driver.quit();




    }
}
