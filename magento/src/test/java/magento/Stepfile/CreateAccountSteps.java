package magento.Stepfile;

import Base_Class.Hooks;
import Locators.CreateAccountPage_Locators;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountSteps extends Hooks {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

    @Given("the user is on the Magento homepage")
    public void the_user_is_on_the_magento_homepage() {
        browserLaunch();
    }

    @When("the user clicks on createAccount button")
    public void the_user_clicks_on_createAccount_button() {
        driver.findElement(CreateAccountPage_Locators.CREATEACCOUNTLINK).click();

    }

    @When("the user enters {string} in the First Name field")
    public void the_user_enters_in_the_first_name_field(String string) {
        driver.findElement(CreateAccountPage_Locators.FIRSTNAME).sendKeys("Rajesh");


    }

    @When("the user enters {string} in the Last Name field")
    public void the_user_enters_in_the_last_name_field(String string) {
        driver.findElement(CreateAccountPage_Locators.LASTNAME).sendKeys("kumar");

    }

    @When("the user enters {string} in the Email Address field")
    public void the_user_enters_in_the_email_address_field(String string) {
        driver.findElement(CreateAccountPage_Locators.EMAILID).sendKeys("resh@gmail.com");

    }

    @When("the user enters {string} in the createAccount Password field")
    public void the_user_enters_in_the_createAccount_password_field(String string) {
        driver.findElement(CreateAccountPage_Locators.PASSWORD).sendKeys("Rajesh@123");

    }

    @When("the user enters {string} in the Confirm Password field")
    public void the_user_enters_in_the_confirm_password_field(String string) {
        driver.findElement(CreateAccountPage_Locators.CONFIRMPASSWORD).sendKeys("Rajesh@123");

    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
        driver.findElement(CreateAccountPage_Locators.CREATEACCOUNTBTN).click();
        explicitWait().until(ExpectedConditions.elementToBeClickable(CreateAccountPage_Locators.CREATEACCOUNTBTN));


    }

    @Then("the user clicks the signout button")
    public void the_user_clicks_the_signout_button() {
        explicitWait().until(ExpectedConditions.elementToBeClickable(CreateAccountPage_Locators.ACTIONMENUDROPDOWN));
        driver.findElement(CreateAccountPage_Locators.ACTIONMENUDROPDOWN).click();
        driver.findElement(CreateAccountPage_Locators.SIGNOUTBTN).click();

    }

}
