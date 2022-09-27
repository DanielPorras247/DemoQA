package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.interactions.IdentifyOption;
import starter.navigation.DemoQAHomePage;
import starter.navigation.NavigateTo;
import starter.navigation.SelectElementsOption;
import starter.questions.ValidateRadioButton;
import starter.tasks.SelectRadioButton;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RadioButtonStepDefinition {

    @When("he select the radio button:")
    public void he_select_the_radio_button(DataTable dataTable) {
        List<String> data = dataTable.asList();
       theActorInTheSpotlight().attemptsTo(SelectRadioButton.onPage(data));
    }

    @Then("he should see the message with the option  that selected:")
    public void he_should_see_the_message_with_the_option_that_selected(DataTable dataTable) {
        theActorInTheSpotlight().should(seeThat(
                "Displayed result", ValidateRadioButton.onTheScreen(), equalTo(
                        Serenity.sessionVariableCalled("OptionUsed"))));
    }
}
