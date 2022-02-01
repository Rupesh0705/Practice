package BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

  public  DriverFactory driverFactory = new DriverFactory();


  @Before

  public void setup(){
    driverFactory.OpenBrowser();
  }

  @After

  public void TearDown(){
    driverFactory.CloseBrowser();
  }


} // end of Hooks class
