package Locators;

import org.openqa.selenium.By;

public class CreateAccountPage_Locators {

    public static By CREATEACCOUNTLINK = By.xpath("//div[@class=\"panel header\"]/descendant::a[text()=\"Create an Account\"]");
    public static By FIRSTNAME = By.xpath("//input[@id=\"firstname\"]");
    public static By LASTNAME = By.xpath("//input[@id=\"lastname\"]");
    public static By EMAILID = By.xpath("//input[@id=\"email_address\"]");
    public static By PASSWORD = By.xpath("//input[@id=\"password\"]");
    public static By CONFIRMPASSWORD = By.xpath("//input[@id=\"password-confirmation\"]");
    public static By CREATEACCOUNTBTN = By.xpath("//button[contains(@class,\"action submit primary\")]");
    public static By ACTIONMENUDROPDOWN = By.xpath("//div[@class=\"panel header\"]/descendant::button[@class=\"action switch\"]");
    public static By SIGNOUTBTN = By.xpath("(//a[contains(text(),\"Sign Out\")])[1]");



}
