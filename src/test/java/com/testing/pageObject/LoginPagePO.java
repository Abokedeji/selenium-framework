package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {

    // Element Locators

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;

    // Initialise Web Elements to use selenium webdriver

    public LoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    // Page Specific Methods

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);

    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);

    }

    public void clickSignInButton(){
        SignInButton.click();


    }




















}
