package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOnePage extends BasePage {

    public TaskOnePage(WebDriver driver) {
        super(driver);
    }

    public TaskOnePage checkPageIsVisible(String taskTitle) {
        isElementDisplayed(By.xpath("//li[text()='Zadanie "+ taskTitle +"']"));
        return this;
    }
}
