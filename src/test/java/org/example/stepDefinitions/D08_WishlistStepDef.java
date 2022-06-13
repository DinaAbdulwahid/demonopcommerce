package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P04_homePage;

public class D08_WishlistStepDef {
    P04_homePage wishList = new P04_homePage(Hooks.driver);
    int wishlistNumber;
    @When("user add product to wishlist")
    public void wishlist() throws InterruptedException {
      wishList.wishListsBtn().get(2).click();
      Thread.sleep(3000);
    }

    @Then("wishlist notification success is visible")
    public void wishListAssertion()
    {
        Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed();
    }

    @And("user get the number of wishlist items after adding product")
    public void wishlist_numbers()
    {
      String text = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
     // String text = Hooks.driver.findElement(By.cssSelector("span[class=\"qty-input\"]")).getAttribute("value");
        System.out.println(text);

      text = text.replaceAll("[^0-9]","");
      wishlistNumber = Integer.parseInt(text);


    }

    @Then("number of wishlist items increased")
    public void items_increased(){
        Assert.assertTrue(wishlistNumber>0);
    }

}
