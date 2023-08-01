import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.Properties;

import java.nio.file.WatchEvent;

public class BaseTest {
    WebDriver driver = Driver.getDriver();
    BasePage page = new BasePage(driver);
    String URL = Properties.BASE_URL;
    public void switchTab(int tabNumber) {
        String[] handles = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(handles[tabNumber]);
    }

    @BeforeEach
    public void setup(){
        driver.get(URL);
        switchTab(0);
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
