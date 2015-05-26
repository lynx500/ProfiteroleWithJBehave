package com.profiterole.jbehave;

import com.profiterole.steps.CreateMenuSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CreateMenuJBSteps {

    @Steps
    CreateMenuSteps createMenuSteps;

    @Given("the user is on the MenuOnDay page")
    public void givenTheUserIsOnTheMenuOnDayPage() {
        createMenuSteps.openMenuOnDayPage();
    }

    @Given("the user clicks the Breakfast button")
    public void givenTheUserClicksBreakfastButton() {
        createMenuSteps.clickBreakfast();
    }

    @When("the user clicks ukrainian cuisine")
    public void givenTheUserClicksUkrainianCuisine() {
        createMenuSteps.clickUkrCuisine();
    }

    @When("the user clicks the Breakfast button")
    public void whenTheUserClicksTheBreakfastButton() {
        createMenuSteps.clickBreakfast();
    }

    @When("the user clicks milk")
    public void whenTheUserClicksMilk() {
        createMenuSteps.clickMilk();
    }

    @When("drag and drops milk on breakfast")
    public void whenDragNDropDishForBreakfast() {
        createMenuSteps.dragNDropDishForBreakfast();
    }

    @Then("the user sees left headline '$headline'")
    public void thenTheUserSeesLeftHeadline(String headline) {
        createMenuSteps.checkLeftHeadline(headline);
    }

    @Then("the user sees right headline '$headline'")
    public void thenTheUserSeesRightHeadline(String headline) {
        createMenuSteps.checkRightHeadline(headline);
    }

    @Then("the user sees the headline in the modal recipe window '$headline'")
    public void thenTheUserSeesHeadlineInTheModalRecipeWindow(String headline) {
        createMenuSteps.checkHeadlineInModalRecipeWindow(headline);
    }

    @Then("the user sees milk in the menu")
    public void thenTheUserSeesMilkInTheMenu() {
        createMenuSteps.checkDishOnBreakfast();
    }
}
