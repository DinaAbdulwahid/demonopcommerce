package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.P07_followUs;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followUs P07 = new P07_followUs(Hooks.driver);

    @When("user opens facebook link")
    public void openFacebook()
    {
        P07.facebook.click();
    }

    @Then("facebook url is opened in new tab")
    public void facebookAssertion() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> socialMediaTabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(socialMediaTabs.get(1));

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("facebook"),Hooks.driver.getTitle());

        Hooks.driver.close();
        Hooks.driver.switchTo().window(socialMediaTabs.get(0));

    }

    @When("user opens twitter link")
    public void openTwitter(){
        P07.twitter.click();
    }

    @Then("twitter url is opened in new tab")
    public void twitterAssertion() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> socialMediaTabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(socialMediaTabs.get(1));

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("twitter."),Hooks.driver.getTitle());

        Hooks.driver.close();
        Hooks.driver.switchTo().window(socialMediaTabs.get(0));

    }

    @When("user opens rss link")
    public void openRss(){
        P07.Rss.click();
    }

    @Then("rss url is opened")
    public void rssAssertion() throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

    }

    @When("user opens youtube link")
    public void openYoutube(){
        P07.YouTube.click();
    }

    @Then("youtube url is opened in new tab")
    public void youTubeAssertion() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> socialMediaTabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(socialMediaTabs.get(1));

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("youtube"),Hooks.driver.getTitle());

        Hooks.driver.close();
        Hooks.driver.switchTo().window(socialMediaTabs.get(0));

    }

}