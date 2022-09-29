package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateButtonSelected {
    public static Question<String> byClick(String result){
        return actor -> TextContent.of(ElementLocated.by(
                "//p[contains(text(),'"+result+"')]")).viewedBy(actor).asString().trim();
    }
}
