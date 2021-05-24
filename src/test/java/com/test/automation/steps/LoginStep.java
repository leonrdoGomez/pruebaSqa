package com.test.automation.steps;

import com.test.automation.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginPage;

    @Step("Open the jump page")
    public void openPage(){
        loginPage.open();
    }

    @Step("Login option my account")
    public void clickBtnAccount(){
        loginPage.clickBtnAccount();
    }

    @Step("Login option login")
    public void clickBtnLogIn(){
        loginPage.clickBtnLogIn();
    }

    @Step("Enter email and password option")
    public void clickBtnCredentials(){
        loginPage.clickBtnCredentials();
    }

    @Step("Write the user in the login page")
    public void writeUser(String user){
        loginPage.setUserInput(user);
    }

    @Step("Write the password in the login page")
    public void writePassword(String password){
        loginPage.setPasswordInput(password);
        loginPage.clickRegister();
    }

    @Step("Validate Log In")
    public boolean validateLbl(){
        boolean flag;

        if (loginPage.validateLbl()){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    @Step("Click button search")
    public void clickBtnSearch(){
        loginPage.clickBtnSearch();
    }

    @Step("Log Out")
    public void ClickBtnLogOut(){
        loginPage.ClickBtnLogOut();
    }
}