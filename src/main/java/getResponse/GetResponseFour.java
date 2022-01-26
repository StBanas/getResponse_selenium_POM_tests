package getResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class GetResponseFour {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\selenium-drivers\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "pl-PL");

//        FirefoxOptions options = new FirefoxOptions();
//        options.setProfile(profile);
//        driver = new FirefoxDriver(options);

        GetResponsePOM page = new GetResponsePOM(driver);
        page.open();

        driver.get("https://www.getresponse.com/resources?type%5B%5D=guides");

        WebElement inputItem;

        inputItem = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        inputItem.sendKeys("7 Tips for Boosting");
        inputItem.submit();


        driver.get("https://www.getresponse.com/resources?query=7+Tips+for+Boosting&i=12&sort=date_desc");

        inputItem = driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div/div[1]/div/h2/a"));                             //("//*[@id=\"results\"]/div[2]/div/div[1]/figure/a/img"));
        inputItem.click();
        page.close();


    }
}
