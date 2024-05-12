package stepDefinition;

import data.GetData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utility.Configuration;

public class AddProductToCartStepDefinition {
    @Given("user searches products in all categories")
    public void user_searches_products_in_all_categories() {
        Configuration configuration = new Configuration();
        configuration.setup();

        HomePage homePage = configuration.homePage;
        AllCategoriesPage allCategoriesPage = configuration.allCategoriesPage;
        GetData getData = configuration.getData;

        homePage.clickAllCategories();
        allCategoriesPage.searchProduct(getData.productName);
    }

    @When("user filters price range")
    public void user_filters_price_range() {
        Configuration configuration = new Configuration();
        configuration.setup();

        ProductPage productPage = configuration.productPage;
        GetData getData = configuration.getData;

        productPage.filterPriceRange(getData.minPrice, getData.maxPrice);
        productPage.selectListedProduct(3);
    }

    @Then("user validates add to cart button")
    public void user_validates_add_to_cart_button() {
        Configuration configuration = new Configuration();
        configuration.setup();

        ProductDetailPage productDetailPage = configuration.productDetailPage;

        productDetailPage.validateAddChartButton();
    }
}
