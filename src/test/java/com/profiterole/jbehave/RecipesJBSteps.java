package com.profiterole.jbehave;

import com.profiterole.steps.RecipesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class RecipesJBSteps {

    @Steps
    RecipesSteps recipesSteps;

    @Given("the user is on the Recipes page")
    public void givenTheUserIsOnTheRecipesPage() {
        recipesSteps.openRecipesPage();
    }

    @When("the user opens Japanese cuisine")
    public void whenTheUserOpensJapaneseCuisine() {
        recipesSteps.openJapaneseCuisine();
    }

    @Then("the user sees headline '$headline'")
    public void thenTheUserSeesHeadline(String headline) {
        recipesSteps.checkCuisineHeadline(headline);
    }
}
