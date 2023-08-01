import org.junit.jupiter.api.Test;

public class AddToWishTest extends BaseTest {
    @Test
    public void AddToWish() throws InterruptedException {
        page.headerPage.clickMobilierLink();
        page.shopPage.clickToWish();

        Thread.sleep(3000);

    }
}
