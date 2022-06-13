package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginTab() {
        WebElement loginPage = Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return loginPage;
    }
    WebElement email = Hooks.driver.findElement(By.id("Email"));
    WebElement password = Hooks.driver.findElement(By.id("Password"));

    public void validData(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public WebElement loginBtN() {
        WebElement loginButton = Hooks.driver.findElement(By.className("button-1 login-button"));
        return loginButton;
    }

    public WebElement myAccountTab() {
        WebElement myAccount = Hooks.driver.findElement(By.className("ico-account"));
        return myAccount;
    }

}
