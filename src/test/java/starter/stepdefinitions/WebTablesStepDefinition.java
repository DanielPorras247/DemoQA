package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import starter.tasks.FillOut;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WebTablesStepDefinition {
    @When("he adds a new Registration Form:")
    public void he_adds_a_new_registration_form(DataTable dataTable) {
        List<String> data = dataTable.asList();
        theActorInTheSpotlight().attemptsTo(FillOut.theForm(data));
    }

    @Then("he should see the record in the table")
    public void he_should_see_the_record_in_the_table(DataTable dataTable) {
        List<String> data = dataTable.asList();
        for (int i=0; i<data.size(); i++){
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElementLocated.by(
                "//div[contains(text(),'"+data.get(i)+"')]")).isDisplayed());
        }
    }

}
