package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import reusableFunc.webActions;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id="UserName")
    private WebElement txt_username;

    @FindBy(id="Password")
    private WebElement txt_password;

    @FindBy(id = "loginIn")
    private WebElement btn_login;

    // Functions
    public HomePage login(String userName, String password) {
        webActions.enterText(txt_username, userName);
        webActions.enterText(txt_password,password);
        webActions.performClick(btn_login);
        return new HomePage(driver);
    }
}