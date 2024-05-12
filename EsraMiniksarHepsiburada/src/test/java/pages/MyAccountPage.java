package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;

public class MyAccountPage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public MyAccountPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By loginButton = By.xpath("//android.widget.Button[@resource-id=\"com.pozitron.hepsiburada:id/button\" and @text=\"Giriş yap\"]");
    By userName = By.id("com.pozitron.hepsiburada:id/tvUserNameFull");
    By welcomePopupOkButton = By.id("android:id/button1");

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickWelcomePopUpOkButton() {
        wait.until(ExpectedConditions.elementToBeClickable(welcomePopupOkButton)).click();
    }

    public void validateUserNameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        WebElement userNameElement = driver.findElement(userName);
        if (userNameElement.isDisplayed()) {
            System.out.println("Welcome PopUp appear on page.");
        } else {
            fail("Welcome PopUp not appear on page.");
        }
    }
}
