package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private final AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public BasePage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By permissionDisallowButton = By.id("com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button");

    public void disallowPermission() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(permissionDisallowButton));
            WebElement permissionDisallowElement = driver.findElement(permissionDisallowButton);

            if (permissionDisallowElement.isDisplayed()) {
                permissionDisallowElement.click();
            }
        } catch (Exception e) {
            System.out.println("Permission already disallowed.");
        }
    }

    public void startApplication(String applicationName) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId(applicationName).click();
    }
}
