package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountInformationPagePO {

    // Element Locator

    @FindBy(id = "current-password")
    public static WebElement CurrentPasswordField;

    @FindBy(id = "password")
    public static WebElement NewPasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmNewPasswordField;

    @FindBy(css = ".save > span:nth-child(1)")
    public static WebElement SaveButton;

    // Initialise Web Elements to use selenium Webdriver

    public EditAccountInformationPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    // Page Specific Method

    public static void enterCurrentPassword(String CurrentPassword){
        CurrentPasswordField.sendKeys(CurrentPassword);

    }

    public static void enterNewPassword(String NewPassword){
        NewPasswordField.sendKeys(NewPassword);

    }

    public static void enterConfirmNewPassword(String ConfirmNewPassword){
        ConfirmNewPasswordField.sendKeys(ConfirmNewPassword);
    }

    public void clickSaveButton(){
        SaveButton.click();
    }





}
