package StepDefinition;

import PageObject.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultPageStepDefinition {

    ResultPage resultpage = new ResultPage();

    @Given("user is on the ResultPage of Homepage  Argos Website")
    public void user_is_on_the_ResultPage_of_Homepage_Argos_Website() {
        resultpage.ResultpageAssertion();
    }

    @When("User click on the Category Option on Result Page")
    public void user_click_on_the_Categeory_Option_on_Result_Page() {

       resultpage.SelectCategory();
    }

    @Then("User should be able to get all the products of the selected option.")
    public void user_should_be_able_to_get_all_the_products_of_the_selected_option() {
    }

} // end of class
