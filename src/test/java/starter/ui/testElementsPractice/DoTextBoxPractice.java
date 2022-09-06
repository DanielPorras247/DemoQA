package starter.ui.testElementsPractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoTextBoxPractice implements Task {

    private final String fullName;
    private final String email;
    private final String currentAddress;
    private final String permanetAddress;

    public DoTextBoxPractice(String fullName, String email, String currentAddress, String permanetAddress) {
        this.fullName = fullName;
        this.email = email;
        this.currentAddress = currentAddress;
        this.permanetAddress = permanetAddress;
    }


    public static Performable withTheData(String fullName, String email, String currentAddress, String permanetAddress){
        return instrumented(DoTextBoxPractice.class, fullName, email, currentAddress, permanetAddress);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TextBoxPage.TEXT_BOX_OPTION),
                WaitUntil.the(TextBoxPage.FULL_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(fullName).into(TextBoxPage.FULL_NAME),
                Enter.theValue(email).into(TextBoxPage.EMAIL),
                Scroll.to(TextBoxPage.CURRENT_ADDRESS),
                Enter.theValue(currentAddress).into(TextBoxPage.CURRENT_ADDRESS),
                Enter.theValue(permanetAddress).into(TextBoxPage.PERMANENT_ADDRESS),
                WaitUntil.the(TextBoxPage.SUBMIT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TextBoxPage.SUBMIT_BUTTON)
        );

    }

}
