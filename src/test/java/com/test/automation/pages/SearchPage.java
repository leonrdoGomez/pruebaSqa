package com.test.automation.pages;

import com.test.automation.utils.Functions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends Functions {

    @FindBy(xpath = "//app-libros/div[3]/div/div/div[3]/div[2]")
    public WebElementFacade lblConsult;

    public boolean validateConsult(){
        return waitFor(lblConsult).isVisible();
    }
}