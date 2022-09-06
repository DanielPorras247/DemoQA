package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.navigation.SelectElementsOption;
import starter.test_Elements_Practice.DoTextBoxPractice;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class TextBoxStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage( new OnlineCast());
    }

    @Given("^(.*) wants interacting with (.*) of type textbox")
    public void wants_interact_with_elements_of_type_textbox(String actor, String option) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.theDemoQAHomePage(),
                SelectElementsOption.to_Practice(option));
    }

    @When("he send a text to the textbox")
    public void he_send_a_text_to_the_textbox() {
        withCurrentActor(
                DoTextBoxPractice.withTheData(
                "Daniel",
                "correoprueba1@correo.com",
                "cra 11 # 11 - 11",
                "Sabaneta, Antioquia"));

    }
    @Then("he should see the text on the web")
    public void he_should_see_the_text_on_the_web() {

    }
}
