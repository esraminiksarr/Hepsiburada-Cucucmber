package stepDefinition;

import data.GetData;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.MenuPage;
import pages.MyAccountPage;
import utility.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;


public class LoginStepDefinition {

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        Configuration configuration = new Configuration();
        configuration.setup();

        BasePage basePage = configuration.basePage;
        MenuPage menuPage = configuration.menuPage;
        MyAccountPage myAccountPage = configuration.myAccountPage;

        basePage.disallowPermission();
        menuPage.clickMyAccount();
        myAccountPage.clickLoginButton();
    }

    @When("user logs in")
    public void user_logs_in() {
        Configuration configuration = new Configuration();
        configuration.setup();

        LoginPage loginPage = configuration.loginPage;
        MyAccountPage myAccountPage = configuration.myAccountPage;
        GetData getData = configuration.getData;

        loginPage.loginApplication(getData.email, getData.password);
        myAccountPage.clickWelcomePopUpOkButton();
    }

    @Then("user validates login")
    public void user_validates_login() {
        Configuration configuration = new Configuration();
        configuration.setup();

        MyAccountPage myAccountPage = configuration.myAccountPage;

        myAccountPage.validateUserNameField();
    }
}