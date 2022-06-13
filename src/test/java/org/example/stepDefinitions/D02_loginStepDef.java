package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_login;

public class D02_loginStepDef {
    P02_login P02 = new P02_login();
    @Given("user go to login page")
    public void openSignIn()
    {
        P02.loginTab().click();
    }
    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void enterValidDate(String email,String password){
         P02.validData(email,password);
    }
    @And("user press on login button")
    public void clickLoginBtn()
    {
        P02.loginBtN().click();
    }
    @Then("user should login successfully")
    public void loginAssertion()
    {
        SoftAssert loginAssert = new SoftAssert();
        loginAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        loginAssert.assertTrue(P02.myAccountTab().isDisplayed());
        loginAssert.assertAll();
    }
}
