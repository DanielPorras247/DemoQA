package starter.userinterfaces;

import org.openqa.selenium.By;

public class RadioButtonPage {
    public static By RaddioButtonOption = By.xpath("//div[normalize-space()=\"Yes\"]//input");
    public static By RESULT_SELECTED = By.xpath("//p[contains(text(),'You have selected ')]//span");
}
