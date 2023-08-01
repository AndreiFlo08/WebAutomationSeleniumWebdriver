import org.junit.jupiter.api.Test;
import utils.Properties;

public class UpdateDeliveryAdressTest extends BaseTest{
    @Test
    public void updateDeliveryAdress() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickAutentificationLink();
        page.loginPage.enterEmail(Properties.EMAIL);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();
        page.headerPage.clickMyAccountLink();
        page.headerPage.clickContulMeuLink();
        page.deliveryAdressPage.clickAdressLink();
        Thread.sleep(3000);
        page.shopPage.clickCoockies();
        Thread.sleep(2000);
        page.deliveryAdressPage.clickupdateAdressLink();
        page.deliveryAdressPage.enterSecondName(Properties.secondName);

        Thread.sleep(3000);


    }
}
