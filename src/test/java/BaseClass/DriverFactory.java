package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
   public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public  void  OpenBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='consent_prompt_submit']")).click();
    }  // end of openbrowser

    public void CloseBrowser(){
       // driver.quit();
    } // end of closebrowser






}// end of Driverfactory class

