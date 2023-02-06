package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.LoginPagePO;
import com.testing.pageObject.MyAccountPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    }
}
