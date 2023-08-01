import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Messages;
import utils.Properties;

public class AddToCartTest extends BaseTest{
    @Test
    public void addToCart() throws InterruptedException {
        page.headerPage.clickMobilierLink();
        page.shopPage.clickCoockies();
        Thread.sleep(2000);
        page.shopPage.clickToAddToCart();
        Thread.sleep(2000);
        page.shopPage.clickViewCart();

        Thread.sleep(3000);

    }
}
