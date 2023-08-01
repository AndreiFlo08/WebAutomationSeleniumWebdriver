package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {
    WebDriver driver;

    public ShopPage(WebDriver driver){
        this.driver=driver;


    }

    //Selectors
    private By addToCartButton = By.xpath("//a[@class='cart_button ajax_add_to_cart_button'][@data-id-product='636']");
    private By viewCartLink = By.xpath("//a[@title = 'Finalizează comanda']");
    private By coockies = By.xpath("//button[@id='accept-all-gdpr']");
    private By addToWishButton = By.xpath("//span[@onclick = 'addShortList(this, 637)']");


    //Methods
   public void clickToAddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void   clickViewCart() {
        driver.findElement(viewCartLink).click();

    }
    public void clickCoockies(){
       driver.findElement(coockies).click();
    }
    public void clickToWish(){
       driver.findElement(addToWishButton).click();
    }



}
