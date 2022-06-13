package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P04_homePage {
    WebDriver driver;

    public P04_homePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement searchButton;

    public List<WebElement> wishListsBtn()
    {
      return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

}
