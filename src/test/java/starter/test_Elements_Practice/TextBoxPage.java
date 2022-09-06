package starter.test_Elements_Practice;

import org.openqa.selenium.By;

public class TextBoxPage {
    public static By TEXT_BOX_OPTION = By.xpath("//*[contains(text(),'Text Box')]//self::span");
    public static By FULL_NAME = By.xpath("//input[@id='userName']");
    public static By EMAIL = By.xpath("//input[@id='userEmail']");
    public static By CURRENT_ADDRESS = By.xpath("//div[@id='currentAddress-wrapper']//div[@class='col-md-9 col-sm-12']//self::textarea");
    public static By PERMANENT_ADDRESS = By.xpath("//*[contains(@id,'permanentAddress')]//self::textarea");
    public static By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");
}
