package starter.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectRadioButton implements Task {

    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    private final List<String> data;

    public SelectRadioButton(List<String> data) {
        this.data = data;
    }

    public static SelectRadioButton onPage(List<String> data){
        return Tasks.instrumented(SelectRadioButton.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement radioButton = driver.findElement(By.cssSelector("label[for^="+data.get(0)+"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButton);
        Serenity.setSessionVariable("OptionUsed").to(
                data.get(0).substring(0,1).toUpperCase()+data.get(0).substring(1));
    }
}
