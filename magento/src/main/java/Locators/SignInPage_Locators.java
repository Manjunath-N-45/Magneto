package Locators;

import org.openqa.selenium.By;

public class SignInPage_Locators {
    public static By SIGNINLINK = By.xpath("//div[@class=\"panel header\"]/descendant::a[contains(text(),\"Sign In\")]");
    public static By MAILID =By.xpath("//input[@id=\"email\"]");
    public static By PASSWORD =By.xpath("//div[@class=\"login-container\"]/descendant::input[@id=\"pass\"]");
    public static By SUBMITBTN = By.xpath("(//button[@id=\"send2\"])[1]");
}
