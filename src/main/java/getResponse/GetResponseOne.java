package getResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetResponseOne {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        GetResponsePOM page = new GetResponsePOM(driver);
        page.open();

        driver.get("https://www.getresponse.com/resources?type%5B%5D=guides");
        WebElement inputItem;

        inputItem = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        inputItem.sendKeys("7 Tips for Boosting");
        inputItem.submit();


        driver.get("https://www.getresponse.com/resources?query=7+Tips+for+Boosting&i=12&sort=date_desc");

        inputItem = driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div/div[1]/div/h2/a"));
        inputItem.click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("/html/body/div[2]/section[1]/div/main/section/div/article/div[1]/div/a"))).click();


        WebDriverWait wait2 = new WebDriverWait(driver, 3);
        wait2.until(ExpectedConditions.titleContains("7-tips-for-boosting-your-halloween-email-marketing-campaign-infographic.png"));

        page.close();
    }
}
