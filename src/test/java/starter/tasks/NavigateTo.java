package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.userinterfaces.DemoQAHomePage;

public class NavigateTo {
    public static Performable theDemoQAHomePage() {
        return Task.where("{0} opens the Demo QA home page",
                Open.browserOn().the(DemoQAHomePage.class));
    }
}
