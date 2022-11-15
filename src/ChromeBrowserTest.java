import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {


        //1)Setup chrome Browser
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver ","drivers/chromedriver.exe");
        WebDriver driver = new EdgeDriver();

        //2)Open url
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
        userfield.sendKeys("kfhsjdk");

        //7)Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("jufshs5478");

        //8)Close the browser
        //driver.quit();

    }
}