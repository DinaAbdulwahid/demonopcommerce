package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_currencies {

    public void euroCurreny(){
        WebElement euro = Hooks.driver.findElement(By.name("customerCurrency"));
        Select select = new Select(euro);
        select.selectByVisibleText("Euro");
    }

    public List<WebElement> productCurrency()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
