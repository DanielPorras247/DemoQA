package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.RadioButtonPage;

public class ValidateRadioButton implements Question {

    public static Question<String> onTheScreen(){
        return new ValidateRadioButton();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(RadioButtonPage.RESULT_SELECTED).getText().trim();
    }
}
