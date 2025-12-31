package reusableFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webActions {

    public static void performClick(WebElement locator) {
        locator.click();
    }

    public static void enterText(WebElement locator, String str) {
        locator.sendKeys(str);
    }

    public static void enterText(WebElement locator, int val) {
        locator.sendKeys(String.valueOf(val));
    }

    public static void selectDropDownByText(WebElement locator, String str) {
        Select dropDown = new Select(locator);
        dropDown.selectByVisibleText(str);
    }
}
