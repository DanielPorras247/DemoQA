package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.userinterfaces.TextBoxPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IdentifyOption implements Interaction {

    private final String option;

    public IdentifyOption(String option) {
        this.option = option;
    }

    public static IdentifyOption toPractice(String option){
        return Tasks.instrumented(IdentifyOption.class, option);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(By.xpath(
                        "//div[@class='element-group']//child::span[contains(text(),'"+option+"')]"), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(By.xpath(
                        "//div[@class='element-group']//child::span[contains(text(),'"+option+"')]")));

    }
}
