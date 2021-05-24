package com.test.automation.pages;

import com.test.automation.utils.Functions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://librerianacional.com/")
public class LoginPage extends Functions {

    @FindBy(xpath = "//div[2]/div/menu-login-header/div/div/div/button")
    public WebElementFacade btnMyAccount;

    @FindBy(xpath = "//div[2]/div/menu-login-header/div/div/div/div/a[1]")
    public WebElementFacade btnLogIn;

    @FindBy(xpath = "//div[2]/app-ingreso/div/div[2]/div/div[5]/a/div/div[1]")
    public WebElementFacade btnCredentials;

    @FindBy(xpath = "//input[@formcontrolname='usuario']")
    public WebElementFacade inputUser;

    @FindBy(xpath = "//input[@formcontrolname='contrasena']")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//div[2]/div/form/div[5]/button")
    public WebElementFacade btnAccess;

    @FindBy(xpath = "//div[3]/div/div[1]/form/div[2]/input[2]")
    public WebElementFacade lblSearch;

    @FindBy(xpath = "//div[3]/div/div/div[3]/div/div[1]/form/div[2]/button")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//div/div/div[1]/div/div/div[2]/div/li[7]/a")
    public WebElementFacade btnLogOut;

    public void clickBtnAccount(){
        waitFor(btnMyAccount).isVisible();
        btnMyAccount.click();
    }

    public void clickBtnLogIn(){
        waitFor(btnLogIn).isVisible();
        btnLogIn.click();
    }

    public void clickBtnCredentials(){
        waitFor(btnCredentials).isVisible();
        btnCredentials.click();
    }

    public void setUserInput(String user){
        waitFor(inputUser).isVisible();
        inputUser.sendKeys(user);
    }

    public void setPasswordInput(String password){
        waitFor(inputPassword).isVisible();
        inputPassword.type(password);
    }

    public void clickRegister(){
        waitFor(btnAccess).isVisible();
        btnAccess.click();
    }

    public boolean validateLbl(){
        return waitFor(lblSearch).isVisible();
    }

    public void writeConsult(){
        waitFor(lblSearch).isVisible();
        lblSearch.type("Proyecto");
        lblSearch.sendKeys(Keys.ENTER);
    }

    public void clickBtnSearch(){
        waitFor(btnSearch).isVisible();
        btnMyAccount.click();
    }

    public void ClickBtnLogOut(){
        waitFor(btnLogOut).isVisible();
        btnMyAccount.click();
    }
}