package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidateHomePage;
import starter.tasks.SelectALinkElement;
import starter.tasks.SwitchToNewWindow;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

public class LinksStepDefinition {

    @When("he select the link that open new tab:")
    public void he_select_a_link_element(DataTable dataTable) {
        List<String> data = dataTable.asList();
        theActorInTheSpotlight().attemptsTo(
                SelectALinkElement.thatOpenNewTab(data),
                SwitchToNewWindow.inTheBrowser());

    }

    @Then("he should see a new window opened")
    public void he_should_see_a_new_window_opened() {
        theActorInTheSpotlight().should(seeThat(
                "HomePage",ValidateHomePage.wasOpened()));
    }
}
