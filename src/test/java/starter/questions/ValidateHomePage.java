package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.userinterfaces.DemoQAHomePage;

public class ValidateHomePage implements Question<Boolean> {

    public static ValidateHomePage wasOpened(){
        return new ValidateHomePage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(DemoQAHomePage.LOGO_PAGE.resolveFor(actor).isVisible()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
