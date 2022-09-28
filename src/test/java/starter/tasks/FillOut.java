package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.TextBoxPage;
import starter.userinterfaces.WebTablesPage;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOut implements Task {

    private final List<String> data;

    public FillOut(List<String> data) {
        this.data = data;
    }

    public static FillOut theForm(List<String> data){
        return Tasks.instrumented(FillOut.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebTablesPage.ADD_BUTTON),
                Enter.theValue(data.get(0)).into(WebTablesPage.FIRST_NAME_FIELD),
                Enter.theValue(data.get(1)).into(WebTablesPage.LAST_NAME_FIELD),
                Enter.theValue(data.get(2)).into(WebTablesPage.EMAIL_FIELD),
                Enter.theValue(data.get(3)).into(WebTablesPage.AGE_FIELD),
                Enter.theValue(data.get(4)).into(WebTablesPage.SALARY_FIELD),
                Enter.theValue(data.get(5)).into(WebTablesPage.DEPARTMENT_FIELD),
                WaitUntil.the(WebTablesPage.SUBMIT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(WebTablesPage.SUBMIT_BUTTON)
                );
    }
}
