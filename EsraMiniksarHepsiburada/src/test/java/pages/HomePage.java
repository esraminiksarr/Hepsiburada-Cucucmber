package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public HomePage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By allCategoriesButton = By.xpath("//android.widget.TextView[@text=\"Tüm Kategoriler\"]");


    public void clickAllCategories() {
        wait.until(ExpectedConditions.elementToBeClickable(allCategoriesButton)).click();
    }


}
