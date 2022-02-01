package PageObject;

import BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {


    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(className = "_2mKaC")
    WebElement searchbutton;


    public void Assertion(){

        String ActualUrl =  "https://www.argos.co.uk/search/nike/";
        Assert.assertEquals(ActualUrl,"https://www.argos.co.uk/search/nike/");
    }


    public void SelectProduct(String item){

        searchbox.sendKeys(item);
        searchbutton.click();

    }

















} // end of class
