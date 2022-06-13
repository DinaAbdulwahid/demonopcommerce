package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    WebDriver driver;

    public P01_register(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Register Click link
    @FindBy(className = "ico-register")
    public WebElement registerTab;

    //Gender radio button
    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement gender;

    //Firstname text field
    @FindBy(id = "FirstName")
    public WebElement FirstName;

    //LastName text field
    @FindBy(id = "LastName")
    public WebElement LastName;


    public void dateOfBirth(){
        WebElement birthday = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(birthday);
        select.selectByValue("20");
    }
    public void dateOfMonth() {
        WebElement month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(month);
        select.selectByValue("4");
    }
    public void dateOfYear(){
        WebElement year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(year);
        select.selectByVisibleText("1995");
    }

   //Email text Field
    @FindBy(id = "Email")
    public WebElement Email;

    //CompanyName text field
    @FindBy(id = "Company")
    public WebElement CompanyName;

    //Password text field
    @FindBy(id = "Password")
    public WebElement Password;

    //ConfirmPassword text field
    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    //RegisterButton text field
    @FindBy(id = "register-button")
    public WebElement RegisterButton;


    //Success Message
    @FindBy(className = "result")
    public WebElement successMessage;

    public void validData(String email){this.Email.sendKeys(email);}

    public void user_password(String password, String confirmpassword)
    {
        this.Password.sendKeys(password);
        this.ConfirmPassword.sendKeys(confirmpassword);
    }


}
