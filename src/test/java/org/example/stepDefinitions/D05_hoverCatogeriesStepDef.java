package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_hoverCatogeriesStepDef {
    String subCategoryName;

    @When("user hover category and select subcategory")
    public void hover_category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);


        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();
        System.out.println(subCategoryName);

        desktops.click();
    }

    @Then("user could open sub-category page")
    public void open_subCategory(){
        String text = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();
        String test = text.toLowerCase();
        System.out.println(test);

        Assert.assertEquals(test,subCategoryName);

    }
}
