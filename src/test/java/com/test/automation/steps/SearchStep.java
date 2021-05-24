package com.test.automation.steps;

import com.test.automation.pages.LoginPage;
import com.test.automation.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchStep {

    LoginPage loginPage;
    SearchPage searchPage;

    @Step("project consultation")
    public void WriteConsult(){
        loginPage.writeConsult();
    }

    @Step("Validate Consult")
    public boolean validateLbl(){
        boolean flag;

        if (searchPage.validateConsult()){
            flag =true;
        }else{
            flag = false;
        }
        return flag;
    }
}
