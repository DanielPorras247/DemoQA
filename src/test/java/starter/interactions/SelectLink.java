package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import java.util.List;

public class SelectLink implements Interaction {

    private final List<String> data;

    public SelectLink(List<String> data) {
        this.data = data;
    }

    public static SelectLink byType(List<String> data){
        return Tasks.instrumented(SelectLink.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    Click.on(By.xpath("//a[text()='Home']//ancestor::a[@id='"+data.get(0)+"Link']")));
    }
}
