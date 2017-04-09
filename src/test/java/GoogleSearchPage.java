import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anna on 2017-04-02.
 */

public class GoogleSearchPage {

    protected WebDriver driver;
    private WebElement q;
    private WebElement btn;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(url);

    }

    public void close() {
        driver.quit();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void searchFor(String searchTerm) {
        q.sendKeys(searchTerm);
        btn.click();
    }

    public void typeSearchTerm(String searchTerm) {
        q.sendKeys(searchTerm);
    }
    public void clickOnSearch() {
        btn.click();
    }


}
