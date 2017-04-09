import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.containsString;



public class WhenAUserSearchesOnGoogle {

    private GoogleSearchPage page;

    @Before
    public void openTheBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        page = PageFactory.initElements(new FirefoxDriver(), GoogleSearchPage.class);
        page.open("http://google.pl/");

    }

    @After
    public void closeTheBrowser() {
        page.close();
    }


   @Test
    public void whenTheUserSearchesFor() {
       page.searchFor("praca it jobs");
       Assert.assertThat(page.getTitle(), containsString("https://nofluffjobs.com/") );
     }

}
