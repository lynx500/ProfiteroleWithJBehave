package com.profiterole.jbehave;

import com.profiterole.steps.ForgotPasswordSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ForgotPasswordJBSteps {

    @Steps
    ForgotPasswordSteps forgotPasswordSteps;

    @Given("the user is on the ForgotPassword page")
    public void givenTheUserOnTheForgotPasswordPage() {
        forgotPasswordSteps.openForgotPasswordPage();
    }

    @When("the user enters email '$email'")
    public void whenTheUserEntersEmail(String email) {
        forgotPasswordSteps.setEmail(email);
    }

    @When("clicks the Next button")
    public void whenTheUserClicksTheNextButton() {
        forgotPasswordSteps.clickNext();
    }

    @Then("the user sees the message '$message'")
    public void thenTheUserSeesTheMessage(String message) {
        forgotPasswordSteps.checkMessageEmailWasSent(message);
    }

    @Then("the user sees the validation message '$message'")
    public void thenTheUserSeesValidationMessage(String message) {
        forgotPasswordSteps.checkMessageIncorrectLogin(message);
    }
}
