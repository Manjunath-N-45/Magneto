package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    public static void browserLaunch(){
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }

    public static FluentWait<WebDriver> explicitWait(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10000));
        return wait;
    }
}
