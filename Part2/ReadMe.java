package Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to https://demo.applitools.com/

        2) Enter the username as "ttechno@gmail.com"

        3) Enter the password as "techno123."

        4) Click on sign in button

        5) Get the following text and print it -->  Your nearest branch closes in: 30m 5s is displayed

        6) Print the URL
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demo.applitools.com");

    }
}

