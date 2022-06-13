package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_currencies;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_currencies P03 = new P03_currencies();



    @Given("Select “Euro” from currency dropdown list")
    public void selectCurrency(){
        P03.euroCurreny();
    }

    @Then("User could find the selected currency")
    public void currencyAssertion(){
        int count = P03.productCurrency().size();
        for(int i=0;i<count;i++)
        {
            String text = P03.productCurrency().get(0).getText();
            Assert.assertTrue(text.contains("€"));
        }

    }

}
