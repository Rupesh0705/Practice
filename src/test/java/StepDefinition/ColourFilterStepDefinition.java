package StepDefinition;

import PageObject.ColourFilter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ColourFilterStepDefinition {

    ColourFilter colourFilter = new ColourFilter();

    @Given("User is on the ResultPage of HomePage and click on Showmore of Argos WebSite")
    public void user_is_on_the_ResultPage_of_HomePage_and_click_on_Showmore_of_Argos_WebSite() {

        colourFilter.ShowmoreButton();
    }


    @When("User clicks on Colour Button")
    public void user_clicks_on_Colour_Button() {

        colourFilter.ColourOption();

    }

    @Then("User should be able to get all the products of the selected colour.")
    public void user_should_be_able_to_get_all_the_products_of_the_selected_colour() {


    }

} // end of class
