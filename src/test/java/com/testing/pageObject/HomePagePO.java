package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element locators - Stage 1
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    // Initialise Web Elements to use selenium webdriver - Stage 2
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    // Page Specific Methods
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();

    }























}
