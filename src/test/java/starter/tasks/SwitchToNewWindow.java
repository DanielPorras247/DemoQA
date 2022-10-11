package starter.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchToNewWindow implements Task {

    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    public static SwitchToNewWindow inTheBrowser(){
        return Tasks.instrumented(SwitchToNewWindow.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(0));
        driver.close();
        driver.switchTo().window(tab2.get(1));
    }
}
