package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableFunc.webActions;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "loginLink")
    private WebElement lbl_loginlink;

    @FindBy(linkText = "Employee List")
    private WebElement lbl_EmployeeListlink;

    @FindBy(linkText = "Log off")
    private WebElement link_logoff;

    // Functions
    public LoginPage goToLoginPage() {
        webActions.performClick(lbl_loginlink);
        return new LoginPage(driver);
    }

    public EmployeeListPage goToEmployeeListPage() {
        webActions.performClick(lbl_EmployeeListlink);
        return new EmployeeListPage(driver);
    }

    public void logOff() {
        webActions.performClick(link_logoff);
    }
}