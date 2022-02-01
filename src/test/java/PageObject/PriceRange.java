package PageObject;

import BaseClass.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceRange extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"findability\"]/div[6]/div/div[3]/div/div/div[1]/div/div/div[2]/div[2]/div/button[2]")
    WebElement Showmore;

    //@FindBy(id="filter-price-£10 - £15-label")
    @FindBy(xpath = "//*[@id=\"filter-price-£200 - £250-label\"]/div/div/span/span")
    WebElement PriceFilter;

       public void PriceRangeBox(){

        PriceFilter.click();
    }

    public void ShowmoreButton(){
        Showmore.click();
    }
} // end of class
