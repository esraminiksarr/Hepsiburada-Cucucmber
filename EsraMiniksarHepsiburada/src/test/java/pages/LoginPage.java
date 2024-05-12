package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    public LoginPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 25);
    }

    By emailField = By.xpath("//android.widget.EditText[@resource-id=\"txtUserName\"]");
    By passwordField = By.xpath("//android.widget.EditText[@resource-id=\"txtPassword\"]");
    By loginButton = By.xpath("//android.widget.Button[@resource-id=\"btnLogin\"]");

    public void loginApplication(String email, String password) {

        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

    }

}

