package PageObject;

import BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverFactory {

   // @FindBy(xpath= "//span[contains(text(),'Sports and fitness')]")                // sports and fitness
   // WebElement category;

  //  @FindBy(xpath = "//*[@id=\"component-accordion-accordion-control-filter-798599\"]/div/span")//Technology category
  //  WebElement category;

    @FindBy(xpath = "//*[@id=\"component-accordion-accordion-control-filter-800122\"]/div/span") // for Jwellery/watches
    WebElement category;

    public void SelectCategory(){

        category.click();
    }

    public void ResultpageAssertion(){
        String ResultpageURL = "https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike";
        Assert.assertEquals(ResultpageURL,"https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
    }



} // end of class
