package PageObject;

import BaseClass.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ColourFilter extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"findability\"]/div[6]/div/div[3]/div/div/div[1]/div/div/div[2]/div[6]/div/button[2]")
    WebElement Showmore;

   // @FindBy(xpath = "//*[@id=\"filter-colour-black-label\"]/div/div")                    // for Black colour Selection
   // WebElement colour;

   // @FindBy(xpath = "//*[@id=\"filter-colour-space grey-label\"]/div/div/svg")      // for space gray colour selection
   // WebElement colour;

   // @FindBy(xpath = "//body/main[@id='app']/div[1]/div[3]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/label[4]/div[1]/div[1]/*[1]")
   // WebElement colour;


    @FindBy(xpath = "//*[@id=\"filter-colour-silver-label\"]/div/div") // for Silver colour
    WebElement colour;

    public void ShowmoreButton(){

        Showmore.click();
    }

    public void ColourOption(){

        colour.click();
    }

} //end of class
