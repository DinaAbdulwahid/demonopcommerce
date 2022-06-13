package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register P01 = new P01_register(Hooks.driver);

    @Given("Click on Register tab")
    public void clickRegisterTab(){ P01.registerTab.click(); }

    @When("Click on any radio button to choose gender")
    public void chooseGender() {P01.gender.click(); }

    @And("User enter First Name and Last Name")
    public void fillNames(){
        P01.FirstName.sendKeys("test");
        P01.LastName.sendKeys("test");
    }

    @And("User select date of birth : select[day, month, year]")
    public void selectDOB(){
        P01.dateOfBirth();
        P01.dateOfMonth();
        P01.dateOfYear();

    }

    @And("^User enter email \"(.*)\" field$")
   /* public void fillEmail(){P01.Email.sendKeys("test@example.com");}  */
    public void personal_details(String email)
    {

        P01.validData(email);
    }

    @And("User fill company name")
    public void fillCompanyName() {P01.CompanyName.sendKeys("Atest");}

    @And("^User fill Password \"(.*)\" and confirm password with \"(.*)\"$")
    public void enterPassword(String password, String confirmPassword){
        P01.user_password(password,confirmPassword);
    }

    @And("Click on REGISTER button")
    public void registerBtn() {P01.RegisterButton.click();}

    @Then("User could register successfully")
    public void RegistrationAssertion() {
        SoftAssert softAssertion = new SoftAssert();

        softAssertion.assertTrue(P01.successMessage.getText().contains("Your registration completed"));
        softAssertion.assertEquals(P01.successMessage.getCssValue("color"), "rgba(76, 177, 124, 1)");
        softAssertion.assertAll();

    }



    }

