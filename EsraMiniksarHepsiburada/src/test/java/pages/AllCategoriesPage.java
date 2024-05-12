package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCategoriesPage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public AllCategoriesPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By searchBoxButton = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    By firstSearchSuggestion = By.xpath("(//android.view.ViewGroup[@resource-id=\"com.pozitron.hepsiburada:id/search_suggestion\"])[1]");

    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.elementToBeClickable(searchBoxButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchBoxButton)).sendKeys(productName);
        wait.until(ExpectedConditions.elementToBeClickable(firstSearchSuggestion)).click();

    }
}
