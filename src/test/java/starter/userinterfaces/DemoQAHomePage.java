package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DemoQAHomePage extends PageObject {
    public static final Target LOGO_PAGE =  Target.the("Elements button menu").
            located(By.xpath("//a[@href='https://demoqa.com']"));
    public static final Target ELEMENTS_MENU = Target.the("Elements button menu").
            located(By.xpath("//div[@class='card-up']//following::*[contains(text(),'Elements')]"));
}
