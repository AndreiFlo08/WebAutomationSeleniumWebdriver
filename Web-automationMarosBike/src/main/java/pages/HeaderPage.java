package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
    WebDriver driver;
    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }
    //Selectors
    public final By myAccountLink = By.xpath("//div[@class= 'links']");
    public final By autentificationLink = By.xpath("//a[@title='Log in to your customer account']");
    public final By mobilierLink = By.xpath("//a[@title = 'Mobilier Living']");
    public final By cartLink = By.xpath("//span[@class= 'title-cart']");
    public final By contulMeuLink = By.xpath("//a[@title='My Account']");
    public final By searchField = By.xpath("//input[@name= 'search_query']");
    public final By logoutLink = By.xpath("//a[@title='Log out']");


    //Methods
    public void clickMyAccountLink(){
        driver.findElement(myAccountLink).click();
    }
    public void clickAutentificationLink(){
        driver.findElement(autentificationLink).click();
    }
    public void clickMobilierLink(){
        driver.findElement(mobilierLink).click();
    }
    public void clickCartLink(){
        driver.findElement(cartLink).click();
    }
    public void clickContulMeuLink(){
        driver.findElement(contulMeuLink).click();
    }
    public void search(String searchCriteria) {
        driver.findElement(searchField).sendKeys(searchCriteria);
    }
    public void clickLogoutLink(){
        driver.findElement(logoutLink).click();
    }
}
