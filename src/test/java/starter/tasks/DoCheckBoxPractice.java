package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CheckBoxPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoCheckBoxPractice implements Task {

    public static Performable withTheElementChoised(){
        return instrumented(DoCheckBoxPractice.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckBoxPage.HOME_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckBoxPage.HOME_BUTTON),
                Click.on(CheckBoxPage.DOCUMENTS_BUTTON),
                Click.on(CheckBoxPage.OFFICE_BUTTON),
                Scroll.to(CheckBoxPage.PRIVATE_CHECK),
                Click.on(CheckBoxPage.PRIVATE_CHECK)
                );
    }
}
