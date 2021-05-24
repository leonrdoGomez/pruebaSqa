package com.test.automation.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Login.feature",
        glue ="com.test.colpatria.automation.stepDefinitions")
public class LoginRunner {
	
}