import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Messages;
import utils.Properties;

public class InvalidLoginTest  extends BaseTest {
    @Test
    public void invalidUsernameTest() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickAutentificationLink();
        page.loginPage.enterEmail(Properties.wrongEMAIL);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();

        Assertions.assertEquals(Messages.invalidEmailMessage,page.loginPage.getErrorMessage());
        Thread.sleep(3000);

    }


}
