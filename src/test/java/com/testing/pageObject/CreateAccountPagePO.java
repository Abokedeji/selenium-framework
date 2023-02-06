package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element locators - Stage 1
    @FindBy(id = "firstname")
    public static WebElement FirstnameField;

    @FindBy(id = "lastname")
    public static WebElement LastnameField;

    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;


    // Initialise Web Elements to use selenium webdriver - Stage 2
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Page Specific Methods - Stage 3
    public void enterFirstName(String FirstName){
        FirstnameField.sendKeys(FirstName);

    }

    public void enterLastName(String Lastname){
        LastnameField.sendKeys(Lastname);

    }

    public void enterEmailAddress(String Email){
        EmailAddressField.sendKeys(Email);

    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);

    }

    public void enterConfirmPassword(String ConfirmPassword){
        ConfirmPasswordField.sendKeys(ConfirmPassword);

    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();


    }

























}
