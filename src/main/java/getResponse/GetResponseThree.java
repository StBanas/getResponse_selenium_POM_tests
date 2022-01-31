package getResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetResponseThree {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        GetResponsePOM page = new GetResponsePOM(driver);
        page.open();

        WebElement inputItem;

        inputItem = driver.findElement(By.xpath(" //*[@id=\"newsletter_name\"]"));
        inputItem.sendKeys("trols wengen");

        inputItem = driver.findElement(By.xpath("//*[@id=\"newsletter_email\"] "));
        inputItem.sendKeys("trols.wengen@gmail.com");

        inputItem = driver.findElement(By.xpath("//*[@id=\"newsletter_submit\"]"));
        inputItem.click();

        page.close();
    }
}
