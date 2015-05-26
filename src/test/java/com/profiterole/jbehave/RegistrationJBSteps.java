package com.profiterole.jbehave;

import com.profiterole.steps.RegistrationSteps;
import com.profiterole.util.DataProvider;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class RegistrationJBSteps {

    @Steps
    RegistrationSteps registrationSteps;
    DataProvider data = new DataProvider();

    @Given("the user is on the Registration page")
    public void givenTheUserIsOnTheRegistratioPage() {
        registrationSteps.openRegistrationPage();
    }

    @When("the user clicks the Register button")
    public void whenTheUserClicksTheRegisterButton() {
        registrationSteps.clickBtnRegister();
    }

    @When("the user fills out all the fields")
    public void whenTheUserFillsOutFields() {
        registrationSteps.fillOutRequiredFields(data.randomString(10000), "123456", data.randomEmail(10000));
        registrationSteps.setGenderMale();
    }

    @When("sets country '$country'")
    public void whenSetsCountry(String country) {
        registrationSteps.setCountry(country);
    }

    @Then("the user sees validation message empty email '$message'")
    public void thenTheUserSeesValidationMessageEmptyEmail(String message) {
        registrationSteps.checkMessageEmptyEmail(message);
    }

    @Then("accept the conditions '$message'")
    public void thenAcceptTheConditions(String message) {
        registrationSteps.checkMessageTickAmAgree(message);
    }

    @Then("appears message about successful registration '$message'")
    public void thenAppearsMessageAboutSuccessfulRegistration(String message) {
        registrationSteps.checkMessageSuccessfulRegistration(message);
    }
}
