package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.MyAccountPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OrderManagementSteps {
    WebDriver driver = Hooks.driver;
    @And("I click on My Orders")
    public void iClickOnMyOrders() {
        MyAccountPagePO myAccountPagePO = new MyAccountPagePO(driver);
        myAccountPagePO.clickMyOrdersLink();

    }

    @Then("My Orders page should be displayed")
    public void myOrdersPageShouldBeDisplayed() {
        String expectedResult = "My Orders";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
