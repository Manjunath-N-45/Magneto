package magento.Stepfile;

import Base_Class.Hooks;
import Locators.SignInPage_Locators;
import io.cucumber.java.en.*;

public class SignInSteps extends Hooks {

    @When("the user clicks on signIn button")
    public void the_user_clicks_on_signIn_button() {
        driver.findElement(SignInPage_Locators.SIGNINLINK).click();

    }

    @When("the user enters {string} in the Email field")
    public void the_user_enters_in_the_email_field(String string) {
        driver.findElement(SignInPage_Locators.MAILID).sendKeys("rakesh@gmail.com");

    }

    @When("the user enters {string} in the signIn Password field")
    public void the_user_enters_in_the_signIn_password_field(String string) {
        driver.findElement(SignInPage_Locators.PASSWORD).sendKeys("password");

    }

    @Then("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button() {
        driver.findElement(SignInPage_Locators.SUBMITBTN).click();

    }

}
