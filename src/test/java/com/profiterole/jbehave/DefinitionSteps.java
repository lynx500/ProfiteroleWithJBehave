package com.profiterole.jbehave;

import com.profiterole.steps.EndUserSteps;
import com.profiterole.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;
    @Steps
    LoginSteps loginSteps;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("the user is on the Login page")
    public void givenTheUserIsOnTheLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("the user enters login '$login' and password '$password'")
    public void whenTheUserEntersLoginAndPassword(String login, String password) {
        loginSteps.setLogin(login);
        loginSteps.setPassword(password);
    }

    @When("click the Login button")
    public void whenClickTheLoginButton() {
        loginSteps.clickLoginBtn();
    }

    @Then("the user see the linkText '$text'")
    public void thenTheUserSeeLinkTextLogout(String text) {
        loginSteps.checkTextOnLogoutLink(text);
    }

}
