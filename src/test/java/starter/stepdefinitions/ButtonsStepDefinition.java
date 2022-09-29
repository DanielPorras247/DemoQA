package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import starter.questions.ValidateButtonSelected;
import starter.tasks.SelectButton;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ButtonsStepDefinition {
    @When("^he does (.*)$")
    public void he_does_click_on_button(String optionClick) {
        theActorInTheSpotlight().attemptsTo(
                SelectButton.byClick(optionClick));
    }

    @Then("^he should see that (.*)$")
    public void he_should_see_that_done_click(String expectedMessage) {
        theActorInTheSpotlight().should(
          seeThat("OptionToValidate", ValidateButtonSelected.byClick(expectedMessage) , equalTo(expectedMessage)));
    }
}
