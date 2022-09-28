package starter.userinterfaces;

import org.openqa.selenium.By;

public class WebTablesPage {
    public static By ADD_BUTTON = By.xpath("//button[@id='addNewRecordButton']");
    public static By FIRST_NAME_FIELD = By.xpath("//input[@id='firstName']");
    public static By LAST_NAME_FIELD = By.xpath("//input[@id='lastName']");
    public static By EMAIL_FIELD = By.xpath("//input[@id='userEmail']");
    public static By AGE_FIELD = By.xpath("//input[@id='age']");
    public static By SALARY_FIELD = By.xpath("//input[@id='salary']");
    public static By DEPARTMENT_FIELD = By.xpath("//input[@id='department']");
    public static By SUBMIT_BUTTON = By.xpath("//button[@id='submit']");
}
