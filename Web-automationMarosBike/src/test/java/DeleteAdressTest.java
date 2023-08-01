import org.junit.jupiter.api.Test;
import utils.Properties;

public class DeleteAdressTest extends BaseTest {
    @Test
    public void deleteAdress() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickAutentificationLink();
        page.loginPage.enterEmail(Properties.EMAIL);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();
        page.headerPage.clickMyAccountLink();
       page.headerPage.clickContulMeuLink();
       page.deliveryAdressPage.clickAdressLink();
       page.deliveryAdressPage.closePopUpMessage ();




        Thread.sleep(5000);

    }

}
