import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "src/test/Resources/HomePage.Feature")                 //** Homepage path of Argos Website

//@CucumberOptions(features = "src/test/Resources/PriceRange.feature")              // Price Range path of Argos Website

//@CucumberOptions(features = "src/test/Resources/ResultPage.feature")             //** Resultpage path of Argos Website

//@CucumberOptions(features = "src/test/Resources/BrandFilter.feature")          //** Brand filter path of Argos website

//@CucumberOptions(features = "src/test/Resources/Type.feature")                  //** Type filter page of Argos WebSite

@CucumberOptions(features = "src/test/Resources/ColourFilter.feature")            // colour filter page of Argos Website



/*@CucumberOptions(features = "src/test/Resources/Type.feature",
        plugin = {"html:target/cucumber-html-report",
                  "json:target/cucumber-jason-report.jason",
                  "junit:target/cucumber-xml-report.xml",
                  "pretty:target/cucumber-pretty-report.txt"})
*/


public class RuncukeTest {



}
