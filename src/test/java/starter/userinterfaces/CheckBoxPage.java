package starter.userinterfaces;


import org.openqa.selenium.By;

public class CheckBoxPage {
    public static By HOME_BUTTON = By.xpath(
            "//span[contains(text(),'Home')]//ancestor::span//child::button");
    public static By DOCUMENTS_BUTTON = By.xpath(
            "//span[contains(text(),'Documents')]//ancestor::span//child::button");
    public static By OFFICE_BUTTON = By.xpath(
            "//span[contains(text(),'Office')]//ancestor::span//child::button");
    public static By PRIVATE_CHECK = By.xpath(
            "//span[contains(text(),'Private')]//ancestor::span//child::span[@class='rct-checkbox']");
    public static By RESULT = By.xpath("//div[@id='result']//child::span[2]");
}
