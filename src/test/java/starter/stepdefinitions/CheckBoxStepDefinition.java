package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.ValidateCheckBoxResult;
import starter.tasks.DoCheckBoxPractice;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.Matchers.equalTo;


public class CheckBoxStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage( new OnlineCast());
    }


    @When("he select check the option Private through the checkbox")
    public void he_select_check_the_option_private_through_the_checkbox() {
        withCurrentActor(DoCheckBoxPractice.withTheElementChoised());
    }

    @Then("^he should see the message that selected (.*)$")
    public void he_should_see_the_message_that_selected_private(String value) {
        theActorInTheSpotlight().should(
                seeThat("Displayed result", ValidateCheckBoxResult.onTheScreen(), equalTo(value)));

    }
}
