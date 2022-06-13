package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_followUs {
    WebDriver driver;
    public P07_followUs(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Facebook")
    public WebElement facebook;

    @FindBy(linkText = "Twitter")
    public WebElement twitter;

    @FindBy(linkText = "RSS")
    public WebElement Rss;

    @FindBy(linkText = "YouTube")
    public WebElement YouTube;
}
