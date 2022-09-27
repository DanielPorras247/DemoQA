package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import starter.interactions.IdentifyOption;
import starter.navigation.NavigateTo;
import starter.navigation.SelectElementsOption;
import starter.questions.ValidateTextBoxResults;
import starter.tasks.DoTextBoxPractice;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class TextBoxStepDefinition {

    @Given("^(.*) wants interacting with Elements of type (.*)")
    public void wants_interacting_with_elements_of_type(String actor, String option) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.theDemoQAHomePage(),
                SelectElementsOption.onScreen(),
                IdentifyOption.toPractice(option));
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
        theActorInTheSpotlight().should(
                seeThat("Daniel", ValidateTextBoxResults.valueName(), isPresent()),
                seeThat("Displayed email ", ValidateTextBoxResults.valueEmail(), equalTo("Email:correoprueba1@correo.com")),
                seeThat("Displayed current address ", ValidateTextBoxResults.valueCurrentAddress(), equalTo("Current Address :cra 11 # 11 - 11")),
                seeThat("Displayed permanent address ", ValidateTextBoxResults.valuePermanentAddress(), equalTo("Permananet Address :Sabaneta, Antioquia"))
        );
        /*this implementation use the question ValidateTextBoxResult, in singular
        System.out.println("**** "+ ValidateTextBoxResults.valuePermanentAddress().answeredBy(theActorInTheSpotlight()));
        **/
    }

    //this implementation in needed to use the isPresent() matcher
    private Matcher<String> isPresent() {
        return not(isEmptyString());
    }
}
