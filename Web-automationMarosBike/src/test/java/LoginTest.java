import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.Message;
import utils.Messages;
import utils.Properties;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickAutentificationLink();
        page.loginPage.enterEmail(Properties.EMAIL);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();

        Assertions.assertEquals(Messages.welcomeMessage,page.loginPage.getWelcomeMessage());
        Thread.sleep(4000);

    }

}
