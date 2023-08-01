package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public LoginPage loginPage;
    public HeaderPage headerPage;
    public ShopPage shopPage;
    public CartPage cartPage;
    public DeliveryAdressPage deliveryAdressPage;



    public BasePage(WebDriver driver){
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        shopPage = new ShopPage(driver);
        cartPage = new CartPage(driver);
        deliveryAdressPage = new DeliveryAdressPage(driver);
    }

}
