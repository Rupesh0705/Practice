package StepDefinition;

import PageObject.TypePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TypeStepDefinition {

    TypePage typePage = new TypePage();

    @Given("User is on the ResultPage of HomePage of Argos WebSite")
    public void user_is_on_the_ResultPage_of_HomePage_of_Argos_WebSite() {

        typePage.TypeAssertion();
    }

    @When("User click on Type option")
    public void user_click_on_Type_option() {

    typePage.TypeFilter();

    }

} // end of class
