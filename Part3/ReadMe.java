package Part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to https://www.snapdeal.com/

        2) Search for teddy bear click on search button

        3) Print the following text -->> We've got .... results for 'teddy bear'

        4) Print the URL

        5) Click on logo snepdeal logo

        6) Print the URL

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.snapdeal.com/");

        WebElement search = driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement click = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        //WebElement click = driver.findElement(By.className("searchformButton"));
        click.click();

        Thread.sleep(3000);

      WebElement result = driver.findElement(By.className("search-result-txt-section"));
        System.out.println(result.getText());

        String URL = driver.getCurrentUrl();
        System.out.println("First URL: " + URL);

        Thread.sleep(3000);

       // WebElement logo = driver.findElement(By.cssSelector("a[class='notIeLogoHeader hashAdded']"));
        WebElement logo = driver.findElement(By.cssSelector("a[href='https://www.snapdeal.com']:nth-of-type(1)"));

        logo.click();

        String URL2 = driver.getCurrentUrl();
        System.out.println("Second URL: " + URL2);




    }
}