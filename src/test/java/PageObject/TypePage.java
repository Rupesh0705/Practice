package PageObject;

import BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypePage extends DriverFactory {


    @FindBy(xpath = "//span[contains(text(),'Smartwatch')]")
    WebElement TypeOption;


    public void TypeAssertion(){

        String ActualUrl =  "https://www.argos.co.uk/search/nike/";
        Assert.assertEquals(ActualUrl,"https://www.argos.co.uk/search/nike/");

    }

    public void TypeFilter(){

        TypeOption.click();
    }


}// end of class
