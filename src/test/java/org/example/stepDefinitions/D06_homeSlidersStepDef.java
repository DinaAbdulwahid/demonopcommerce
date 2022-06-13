package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.P06_homeSliders;

public class D06_homeSlidersStepDef {
    P06_homeSliders P06 = new P06_homeSliders();
    @When("users clicks on nokia slider")
    public void nokiaSlider()
    {
     P06.frontSliders("1").click();
    }

    @Then("relative product for nokia slider is displayed")
    public void slidersAssertionNokia() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @When("users clicks on iphone slider")
    public void iphoneSlider()
    {
        P06.frontSliders("2").click();
    }

    @Then("relative product for iphone slider is displayed")
    public void slidersAssertionIphone() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");

    }
}
