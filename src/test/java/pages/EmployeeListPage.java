package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reusableFunc.webActions;

public class EmployeeListPage {

    private WebDriver driver;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(linkText = "Create New")
    private WebElement btn_createNewEmp;

    @FindBy(name = "Name")
    private WebElement txt_empName;

    @FindBy(name = "Salary")
    private WebElement txt_salary;

    @FindBy(name = "DurationWorked")
    private WebElement txt_durationWorked;

    @FindBy(name = "Grade")
    private WebElement dropdwn_grade;

    @FindBy(name = "Email")
    private WebElement txt_email;

    // Functions
    public void createNewEmployee(String empName, int Salary, int durationWorked, String grade, String emailId) {
        webActions.performClick(btn_createNewEmp);
        webActions.enterText(txt_empName, empName);
        webActions.enterText(txt_salary, Salary);
        webActions.enterText(txt_durationWorked, durationWorked);
        webActions.selectDropDownByText(dropdwn_grade, grade);
        webActions.enterText(txt_email, emailId);
    }
}