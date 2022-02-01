package StepDefinition;

import PageObject.BrandPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrandFilterStepDefinition {

    BrandPage brandpage = new BrandPage();

    @Given("User is on the ResultPage of the Argos Website")
    public void user_is_on_the_ResultPage_of_the_Argos_Website() {

    brandpage.BrandPageAssertion();


    }

    @When("User click on the selcted Brand button")
    public void user_click_on_the_selcted_Brand_button() {

        brandpage.BrandFilter();

    }

    @Then("User should be able to get the all products of the selected Brand")
    public void user_should_be_able_to_get_the_all_products_of_the_selected_Brand() {


    }




} // end of class
