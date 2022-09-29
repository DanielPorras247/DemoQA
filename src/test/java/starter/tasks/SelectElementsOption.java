package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.userinterfaces.DemoQAHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectElementsOption implements Task {

    public static Performable onScreen(){
        return instrumented(SelectElementsOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(DemoQAHomePage.ELEMENTS_MENU),
                Click.on(DemoQAHomePage.ELEMENTS_MENU));

    }

}
