package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;

    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();


    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String Lastname, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(Lastname);
        createAccountPagePO.enterEmailAddress(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page should be displayed")
    public void myAccountPageShouldBeDisplayed() {
        String expectedResult = "My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(Email);
        loginPagePO.enterPassword(Password);


    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.clickSignInButton();

    }

    @Then("An error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        String expectedError = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
        String elementValue = "#maincontent > div.page.messages > div:nth-child(2) > div > div > div";
        String actualError = driver.findElement(By.cssSelector(elementValue)).getText();
        Assert.assertEquals(expectedError, actualError);


    }

    @Then("Customer does not exist error message should be displayed")
    public void customerDoesNotExistErrorMessageShouldBeDisplayed() {
        String expectedErrorMessage = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
        String elementValue = "#maincontent > div.page.messages > div:nth-child(2) > div > div > div";
        String actualErrorMessage = driver.findElement(By.cssSelector(elementValue)).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);


    }

    @Given("I am on My Account page")
    public void iAmOnMyAccountPage() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.clickSignInButton();

    }

    @When("I click on Change Password")
    public void iClickOnChangePassword() {
        MyAccountPagePO myAccountPagePO = new MyAccountPagePO(driver);
        myAccountPagePO.clickChangePasswordLink();

    }

    @And("I enter {string} {string} {string}")
    public void iEnter(String CurrentPassword, String NewPassword, String ConfirmNewPassword) {
        EditAccountInformationPagePO editAccountInformationPagePO = new EditAccountInformationPagePO(driver);
        EditAccountInformationPagePO.enterCurrentPassword(CurrentPassword);
        EditAccountInformationPagePO.enterNewPassword(NewPassword);
        EditAccountInformationPagePO.enterConfirmNewPassword(ConfirmNewPassword);



    }

    @And("I click on Save")
    public void iClickOnSave() {
        EditAccountInformationPagePO editAccountInformationPagePO = new EditAccountInformationPagePO(driver);
        editAccountInformationPagePO.clickSaveButton();
    }

    @Then("Password should be updated")
    public void passwordShouldBeUpdated() {
    }

    @Then("Account deleted error message should be displayed")
    public void accountDeletedErrorMessageShouldBeDisplayed() {
        String expectedErrorShown = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
        String elementValue = "#maincontent > div.page.messages > div:nth-child(2) > div > div > div";
        String actualErrorShown = driver.findElement(By.cssSelector(elementValue)).getText();
        Assert.assertEquals(expectedErrorShown, actualErrorShown);

    }

    @When("I enter valid {string} and invalid {string}")
    public void iEnterValidAndInvalid(String Email, String Password) {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(Email);
        for (int i = 1; i <=5; i++){
            loginPagePO.enterPassword(Password);
            loginPagePO.clearPassword();
            loginPagePO.clickSignInButton();
        }
    }

    @Then("Account has been suspended error message should be displayed")
    public void accountHasBeenSuspendedErrorMessageShouldBeDisplayed() {
    }
}
