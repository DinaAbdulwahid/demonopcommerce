package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P04_homePage P04= new P04_homePage(Hooks.driver);

    @Given("^type \"(.*)\" on search text box$")
    public void searchProduct(String product){
        P04.search.sendKeys(product);
    }

    @When("click on SEARCH button or hit enter key")
    public void clickSearch(){
        P04.searchButton.click();

    }

    @Then("User could find Apple products")
    public void searchAssertion(){
        SoftAssert searchAssertion = new SoftAssert();
        searchAssertion.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=Apple");
        searchAssertion.assertAll();
    }

    @Then("User could find Apple product")
    public void skuAssertion(){
        SoftAssert searchAssertion = new SoftAssert();
        searchAssertion.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=AP_MBP_13");
        searchAssertion.assertAll();
    }

}
