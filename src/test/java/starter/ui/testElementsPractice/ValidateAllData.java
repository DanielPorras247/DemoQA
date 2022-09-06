package starter.ui.testElementsPractice;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateAllData {
    public static Question<String> valueName(){
        return actor -> TextContent.of(TextBoxPage.OUTPUT_NAME).viewedBy(actor).asString().trim();
    }
    public static Question<String> valueEmail(){
        return actor -> TextContent.of(TextBoxPage.OUTPUT_EMAIL).viewedBy(actor).asString().trim();
    }

    public static Question<String> valueCurrentAddress(){
        return actor -> TextContent.of(TextBoxPage.OUTPUT_CURRENT_ADDRESS).viewedBy(actor).asString().trim();
    }
    public static Question<String> valuePermanentAddress(){
        return actor -> TextContent.of(TextBoxPage.OUTPUT_PERMANENT_ADDRESS).viewedBy(actor).asString().trim();
    }
}
