package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import starter.interactions.SelectLink;

import java.util.List;

public class SelectALinkElement implements Task {

    private final List<String> data;

    public SelectALinkElement(List<String> data) {
        this.data = data;
    }

    public static SelectALinkElement thatOpenNewTab(List<String> data){
        return Tasks.instrumented(SelectALinkElement.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectLink.byType(data));
    }
}
