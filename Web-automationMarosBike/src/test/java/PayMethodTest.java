import org.junit.jupiter.api.Test;

public class PayMethodTest extends BaseTest{
    @Test
    public void payMethod() throws InterruptedException {
            page.headerPage.clickMobilierLink();
            page.shopPage.clickCoockies();
            Thread.sleep(2000);
            page.shopPage.clickToAddToCart();
            Thread.sleep(2000);
            page.shopPage.clickViewCart();
            Thread.sleep(2000);
            page.cartPage.clickRadioButton();

            Thread.sleep(3000);
    }
}
