package getResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetResponseTwo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.getresponse.com/resources?query=7+Tips+for&i=12&sort=date_desc");

        WebElement inputItem;

        inputItem = driver.findElement(By.xpath(" //*[@id=\"newsletter_name\"]"));
        inputItem.sendKeys("trols wengen");
        inputItem = driver.findElement(By.xpath("//*[@id=\"newsletter_email\"] "));
        inputItem.sendKeys("trols.wengen@gmail.com");

        inputItem = driver.findElement(By.xpath("//*[@id=\"newsletter_submit\"]"));
        inputItem.click();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.https://mail.google.com/mail");





//        if "kominy":
//        inputItem = driver.findElement(By.xpath("//*[@id=\"rc-imageselect-target\"]/table/tbody/tr[1]/td[1]/div/div[1]/img "));
//        inputItem.click();
//        inputItem = driver.findElement(By.xpath("//*[@id=\"rc-imageselect-target\"]/table/tbody/tr[1]/td[2]/div/div[1]/img"));
//        inputItem.click();
//        inputItem = driver.findElement(By.xpath("//*[@id=\"rc-imageselect-target\"]/table/tbody/tr[3]/td[2]/div/div[1]/img"));
//        inputItem.click();
//        inputItem = driver.findElement(By.xpath("//*[@id=\"recaptcha-verify-button\"]"));
//        inputItem.click();
//
        driver.close();





    }
}
