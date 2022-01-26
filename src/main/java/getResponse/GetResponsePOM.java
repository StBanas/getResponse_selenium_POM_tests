package getResponse;

import org.openqa.selenium.WebDriver;

public class GetResponsePOM {
    private static final String pageUrl = "https://www.getresponse.com/resources?type%5B%5D=guides";

    private final WebDriver webDriver;

    public GetResponsePOM(WebDriver driver) {
        this.webDriver = driver;
    }

    public void open() {
        webDriver.get(pageUrl);
    }

    public void close() {
        webDriver.quit();
    }
}