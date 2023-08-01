package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DeliveryAdressPage {
    WebDriver driver;
    Actions action;
   public DeliveryAdressPage (WebDriver driver){
        this.driver=driver;
        action = new Actions (driver);

    }
    private final By adressLink = By.xpath("//a[@title='Adrese']");
    private final By deleteLink = By.xpath("//a[@title='Șterge']");
   private final By updateAdressLink = By.xpath("//ul[@class= 'last_item item box']//a[@title = 'Actualizează']");
   private final By secondNameField = By.xpath("//input[@id='firstname']");
    //Methods
    public void clickAdressLink(){
        driver.findElement(adressLink).click();
        action.moveToElement (driver.findElement(deleteLink)).click ().perform ();
    }

    public void closePopUpMessage(){
        driver.findElement (deleteLink).sendKeys (Keys.ENTER);
    }
    public void clickupdateAdressLink(){
        driver.findElement(updateAdressLink).click();
    }
    public void enterSecondName(String secondName){
       driver.findElement(secondNameField).sendKeys(secondName);
    }



}
