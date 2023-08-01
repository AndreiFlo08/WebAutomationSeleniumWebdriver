import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Messages;
import utils.Properties;

public class LogoutTest extends BaseTest{
    @Test
    public void Logout() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickAutentificationLink();
        page.loginPage.enterEmail(Properties.EMAIL);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickLogoutLink();

        Thread.sleep(4000);
    }
}
