package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;

public class ProductDetailPage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public ProductDetailPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By addChartButton = By.xpath("//android.widget.TextView[@text=\"Sepete ekle\"]");

    public void validateAddChartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addChartButton));
        WebElement addChartButtonElement = driver.findElement(addChartButton);
        if (addChartButtonElement.isDisplayed()) {
            System.out.println("Add Chart Button appear on page.");
        } else {
            fail("Add Chart Button not appear on page.");
        }
    }
}
