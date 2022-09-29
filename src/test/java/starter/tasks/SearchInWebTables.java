package starter.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchInWebTables implements Task {

    private final List<String> data;

    public SearchInWebTables(List<String> data) {
        this.data = data;
    }

    public static SearchInWebTables withTheData(List<String> data){
        return instrumented(SearchInWebTables.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i=0; i<data.size(); i++){
            theActorInTheSpotlight().attemptsTo(
                    Scroll.to(ElementLocated.by(
                            "//div[contains(text(),'"+data.get(i)+"')]")),
                    Ensure.that(ElementLocated.by(
                            "//div[contains(text(),'"+data.get(i)+"')]")).isDisplayed());
        }
    }
}
