package starter.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectElementsOption implements Task {

    private final String optionToPractice;

    public SelectElementsOption(String optionToPractice) {
        this.optionToPractice = optionToPractice;
    }

    public static Performable to_Practice(String optionToPractice){
        return instrumented(SelectElementsOption.class, optionToPractice);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(DemoQAHomePage.ELEMENTS_MENU),
                Click.on(DemoQAHomePage.ELEMENTS_MENU));

    }

}
