package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.userinterfaces.TextBoxPage;

public class ValidateTextBoxResult implements Question<String> {

    public static Question<String> value(){
        return new ValidateTextBoxResult();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(TextBoxPage.OUTPUT_NAME).getText();
    }


}
