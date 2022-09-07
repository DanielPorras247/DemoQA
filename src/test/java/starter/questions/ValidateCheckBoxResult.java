package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.CheckBoxPage;

public class ValidateCheckBoxResult implements Question<String> {

    public static Question<String> onTheScreen(){
        return new ValidateCheckBoxResult();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CheckBoxPage.RESULT).getText().trim();
    }
}
