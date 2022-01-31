package getResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;


public class GetResponseTwo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=pl-pl");


        WebDriver driver = new ChromeDriver(options);

        GetResponsePOM page = new GetResponsePOM(driver);
        // uruchomienie przeglądarki w trybie zarządzanym przez Selenium
        page.open();

       // wywołanie dokumentu ze stroną wyboru języka
        driver.get("https://www.getresponse.com/change-language?ret=%2F");
        WebElement inputItem;

        // wybór języka polskiego
        inputItem = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/section/div/div/div[12]/a"));
        inputItem.click();

        // test, czy na wywołana strona ma prawidlowy tytuł
        WebDriverWait wait3 = new WebDriverWait(driver, 3);
        wait3.until(ExpectedConditions.titleContains ("GetResponse - zestaw"));

        //test, czy na stronie znajduje się tekst z łańcuchem znaków w języku polskim

        WebElement label = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[1]"));
        try {
            assertEquals( "Rozwi\u0105zania", label.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            page.close();
        }
    }
}
