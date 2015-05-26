package com.profiterole.jbehave;

import com.profiterole.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LoginJBSteps {

    @Steps
    LoginSteps loginSteps;

    @Given("the user is on the Login page")
    public void givenTheUserIsOnTheLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("the user enters login '$login' and password '$password'")
    public void whenTheUserEntersLoginAndPassword(String login, String password) {
        loginSteps.setLogin(login);
        loginSteps.setPassword(password);
    }

    @When("clicks the Login button")
    public void whenClicksTheLoginButton() {
        loginSteps.clickLoginBtn();
    }

    @Then("the user sees the linkText '$text'")
    public void thenTheUserSeesLinkTextLogout(String text) {
        loginSteps.checkTextOnLogoutLink(text);
    }

    @Then("the user sees the text on link '$text'")
    public void thenTheUserSeesTheTextOnLink(String text) {
        loginSteps.checkTextOnProfileLink(text);
    }

    @Then("the user sees validation message '$message'")
    public void thenTheUserSeesValidationMessage(String message) {
        loginSteps.checkMessageIncorrectLogin(message);
    }

}
