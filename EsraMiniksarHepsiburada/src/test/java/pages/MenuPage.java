package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public MenuPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By myAccountButton = By.id("com.pozitron.hepsiburada:id/menuItemAccountFakeView");

    public void clickMyAccount() {

        wait.until(ExpectedConditions.elementToBeClickable(myAccountButton)).click();
    }
}
