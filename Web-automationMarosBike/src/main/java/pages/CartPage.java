package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    private final   By deleteProduct = By.xpath("//i[@class='fas fa-times']");
    private final By radioButton = By.xpath("//label[@id='payment_lbl_180']");

    public void clickDeleteProduct(){
        driver.findElement(deleteProduct).click();

    }
    public void clickRadioButton(){
        driver.findElement(radioButton).click();

    }

}
