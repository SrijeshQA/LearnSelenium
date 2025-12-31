package sample;

import dataModel.createEmployeeData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.EmployeeListPage;
import pages.HomePage;
import pages.LoginPage;

public class UsingTestNG_class1 {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    EmployeeListPage employeeListPage = new EmployeeListPage(driver);

    @BeforeSuite
    public void setup() {
        driver.get("http://eaapp.somee.com/");
    }

    @Test
    @Parameters({"username", "password"})
    public void login(String uname, String pwd){
        homePage.goToLoginPage();
        loginPage.login(uname, pwd);
    }

    @Test(enabled = false, dependsOnMethods = "login", dataProvider = "createEmployees")
    public void createNewEmployee(String name, int salary, int durationWorked, String grade, String emailId) throws InterruptedException {
        homePage.goToEmployeeListPage();
        employeeListPage.createNewEmployee(name, salary, durationWorked, grade, emailId);
        System.out.println("Portal Execution Completed");
    }

    @Test(dependsOnMethods = "login", dataProvider = "createEmployeesWithCustomData", timeOut = 30000)
    public void createNewEmployeewithCustomData(createEmployeeData createEmployeeData) throws InterruptedException {
        homePage.goToEmployeeListPage();
        employeeListPage.createNewEmployee(createEmployeeData.getName(), createEmployeeData.getSalary(), createEmployeeData.getDurationWorked(), createEmployeeData.getGrade(), createEmployeeData.getEmailId());
        System.out.println("Portal Execution Completed");
    }

    @DataProvider(name = "createEmployees")
    public static Object[][] createEmployees() {
        return new Object[][] {
                new Object[] {
                        "dummy4", 40000, 60, "Middle", "dummy4@microsoft.com"
                }
        };
    }

    @DataProvider(name= "createEmployeesWithCustomData")
    public static createEmployeeData[] createEmployeesWithCustomData() {
        return new createEmployeeData[] {
                new createEmployeeData("dummy5", 60000, 50, "Senior", "dummy5@google.com")
        };
    }

    @AfterSuite
    public void tearDown() {
        homePage.logOff();
        driver.quit();
        System.out.println("Test Closure");
    }
}