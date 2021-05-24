package com.test.automation.stepDefinitions;

import com.test.automation.steps.SearchStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

import com.test.automation.steps.LoginStep;
import org.junit.Assert;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Steps
    SearchStep searchStep;

    @Given("^that the User want do login in the application$")
    public void inputApplication() {
        loginStep.openPage();
        loginStep.clickBtnAccount();
        loginStep.clickBtnLogIn();
        loginStep.clickBtnCredentials();
    }

    @When("^he enter credentials (.*) (.*)$")
    public void inputCredentials(String user, String password) {
        loginStep.writeUser(user);
        loginStep.writePassword(password);
    }

    @Then("^he must access the homepage$")
    public void loginSuccessful() {
        Assert.assertTrue(loginStep.validateLbl());
        searchStep.WriteConsult();
        loginStep.clickBtnSearch();
        Assert.assertTrue(searchStep.validateLbl());
      //loginStep.ClickBtnLogOut();
    }
}
