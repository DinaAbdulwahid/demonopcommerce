package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_homeSliders {
    public WebElement frontSliders(String sliderNum) {
        WebElement sliders = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
        return sliders;
    }
}
