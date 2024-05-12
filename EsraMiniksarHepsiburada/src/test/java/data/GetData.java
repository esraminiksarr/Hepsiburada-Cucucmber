package data;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;


public class GetData {
     AndroidDriver<WebElement> driver;

    public GetData(AndroidDriver<WebElement> driver) {
        this.driver = driver;

    }

    public String email = "esraminiksar96@gmail.com";
    public String password = "Test1234";
    public String productName = "Lenovo";
    public String minPrice = "8000";
    public String maxPrice = "20000";

}
