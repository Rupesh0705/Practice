package PageObject;

import BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends DriverFactory {

   @FindBy(xpath = "//*[@id=\"filter-brands-apple-label\"]/div/div")                          // search for apple brand
 //  @FindBy(id="filter-brands-nike-checkbox")                                                       // search for nike
  //  @FindBy(xpath ="//*[@id=\"filter-brands-nike-label\"]/div/div/svg")

    WebElement Brand;

    public void BrandFilter (){

        Brand.click();
    }

    public void BrandPageAssertion(){
      String BrandAssertion = "https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike";
      Assert.assertEquals(BrandAssertion,"https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
    }


} // end of class
