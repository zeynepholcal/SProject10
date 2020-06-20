package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to  http://demoqa.com/text-box

        2) Enter full name as "Automation"

        3) Enter Email as "Testing@gmail.com"

        4) Enter Current Address 1 as "Testing Current Address part 1"

        5) Enter Current Address 2 "Testing Current Address part 2"

        6) Click on submit button

        7) Print the name

        8) Print Email is containing the "Testing"

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demoqa.com/text-box");

       WebElement username = driver.findElement(By.id("userName"));

       username.sendKeys("Automation");

       WebElement userEmail = driver.findElement(By.id("userEmail"));

       userEmail.sendKeys("Testing@gmail.com");

       WebElement currentAddress = driver.findElement(By.id("currentAddress"));

       currentAddress.sendKeys("Testing Current Address part 1");

       WebElement currentAddress2 = driver.findElement(By.id("permanentAddress"));

       currentAddress2.sendKeys("Testing Current Address part 2");

       WebElement submitButton= driver.findElement(By.cssSelector("button[class='btn btn-primary']"));

        //WebElement submitButton= driver.findElement(By.id("submit"));

       submitButton.click();
        WebElement users = driver.findElement(By.id("name"));

        System.out.println(users.getText());
        WebElement email = driver.findElement(By.id("email"));
        System.out.println(email.getText());














    }


}
