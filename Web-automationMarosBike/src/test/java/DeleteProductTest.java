import org.junit.jupiter.api.Test;

public class DeleteProductTest extends BaseTest {
    @Test
    public void DeleteProductFromCart() throws InterruptedException {
        page.headerPage.clickMobilierLink();
        page.shopPage.clickCoockies();
        Thread.sleep(3000);
        page.shopPage.clickToAddToCart();
        Thread.sleep(2000);
        page.shopPage.clickViewCart();
        page.headerPage.clickCartLink();
        page.cartPage.clickDeleteProduct();
        Thread.sleep(5000);





    }
}
