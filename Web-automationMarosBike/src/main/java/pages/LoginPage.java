package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By emailField = By.xpath("//input[@id='email']");
    private final By passwordField = By.xpath("//input[@id='passwd']");
    private final By loginButton = By.xpath("//button[@name='SubmitLogin']");
    private final By welcomeMessage = By.xpath("//p[@class='info-account']");
    private final By errorMessage = By.xpath("//li[contains(text(), 'Autentificare esuata')]");



//Methods
    public void enterEmail(String mail) {
        driver.findElement(emailField).sendKeys(mail);

    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String getWelcomeMessage(){
       return driver.findElement(welcomeMessage).getText();
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public void login(String email, String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}
