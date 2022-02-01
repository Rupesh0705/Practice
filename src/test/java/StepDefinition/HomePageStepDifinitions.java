package StepDefinition;

import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDifinitions {
    HomePage homepage = new HomePage();


    @Given("User is on the web page of the Argos website")
    public void user_is_on_the_web_page_of_the_Argos_website() {

        homepage.Assertion();
    }

    @When("user Search for the any products")
    public void user_Search_for_the_any_products() {

        homepage.SelectProduct("nike");
    }

    @Then("User should be able to get the selected products")
    public void user_should_be_able_to_get_the_selected_products() {

    }

} // end of class
