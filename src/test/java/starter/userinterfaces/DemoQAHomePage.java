package starter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DemoQAHomePage extends PageObject {

    public static By CLOSE_ADS = By.xpath("//img[@id='close_button_svg']");
    public static By ELEMENTS_MENU = By.xpath(
            "//div[@class='card-up']//following::*[contains(text(),'Elements')]");
}
