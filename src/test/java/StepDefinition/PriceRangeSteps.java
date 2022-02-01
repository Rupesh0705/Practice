package StepDefinition;

import PageObject.PriceRange;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PriceRangeSteps {

    PriceRange priceRange = new PriceRange();


    @Given("user is on the ResultPage of Homepage click on showmore  Argos Website")
    public void user_is_on_the_ResultPage_of_Homepage_click_on_showmore_Argos_Website() {

            priceRange.ShowmoreButton();
    }

    @When("User click on £{int} -£{int} Price Range")
    public void user_click_on_£_£_Price_Range(Integer int1, Integer int2) {

        priceRange.PriceRangeBox();

    }

    @Then("User should be able to get all the product with in the selected Price Range")
    public void user_should_be_able_to_get_all_the_product_with_in_the_selected_Price_Range() {

    }

} // end of class
