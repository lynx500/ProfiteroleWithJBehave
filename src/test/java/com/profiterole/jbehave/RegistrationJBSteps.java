package com.profiterole.jbehave;

import com.profiterole.steps.RegistrationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class RegistrationJBSteps {

    @Steps
    RegistrationSteps registrationSteps;

    @Given("the user is on the Registration page")
    public void givenTheUserIsOnTheRegistratioPage() {
        registrationSteps.openRegistrationPage();
    }

    @When("the user clicks the Register button")
    public void whenTheUserClicksTheRegisterButton() {
        registrationSteps.clickBtnRegister();
    }

    @Then("the user sees validation message empty email '$message'")
    public void thenTheUserSeesValidationMessageEmptyEmail(String message) {
        registrationSteps.checkMessageEmptyEmail(message);
    }

    @Then("accept the conditions '$message'")
    public void thenAcceptTheConditions(String message) {
        registrationSteps.checkMessageTickAmAgree(message);
    }
}
