package magento;

import Base_Class.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/magento/feature_file/CreateAccountFeature.feature", glue = "magento/Stepfile", dryRun = false, plugin = {"html:target\\cucumber-reports\\cucumber.html", "json:target\\cucumber-reports\\cucumber.json", "junit:target\\cucumber-reports\\cucumber.xml"})

public class Runner_Class extends Hooks {

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void end() {
        driver.quit();
    }


}
