package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPagePO {
    // Element Locator

    @FindBy(linkText = "My Orders")
    public static WebElement MyOrdersLink;

    @FindBy(linkText = "Change Password")
    public static WebElement ChangePasswordLink;

    // Initialise Web Element to use Selenium Web driver

    public MyAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    // Page specific method

    public void clickMyOrdersLink(){
        MyOrdersLink.click();

    }

    public void clickChangePasswordLink(){
        ChangePasswordLink.click();
    }


}
