package starter.ui.testElementsPractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidateData implements Question<String> {

    public static Question<String> value(){
        return new ValidateData();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(TextBoxPage.OUTPUT_NAME).getText();
    }


}
