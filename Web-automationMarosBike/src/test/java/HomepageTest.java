import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasePage;

public class HomepageTest extends BaseTest {
    @Test
    public void search() throws InterruptedException {
        page.headerPage.search("canapea");
        Assertions.assertEquals("Casa Rusu - Casa Rusu",driver.getTitle());

        Thread.sleep(3000);

    }


}
