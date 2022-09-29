package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.RightClick;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectButton implements Task {

    private final String optionClick;

    public SelectButton(String optionClick) {
        this.optionClick = optionClick;
    }

    public static SelectButton byClick(String optionClick){
        return instrumented(SelectButton.class, optionClick);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (optionClick.contains("Double")){
            theActorInTheSpotlight().attemptsTo(
                    DoubleClick.on(ElementLocated.by(
                            "//button[contains(text(),'"+ optionClick +"')]")));
        }if (optionClick.contains("Right")){
            theActorInTheSpotlight().attemptsTo(
                    RightClick.on(ElementLocated.by(
                            "//button[contains(text(),'"+ optionClick +"')]")));
        }else {
            theActorInTheSpotlight().attemptsTo(
                    Click.on(By.xpath(
                            "//button[text()='"+optionClick+"']")));
        }
    }
}
