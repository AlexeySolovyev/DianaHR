package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.BasePage;

public class TaskThreeTest extends TestBase {

    @Test
    public void firstTest()  {
        main    .goTo()  // "Chain of Invocation" pattern
                .chooseTask("3");
        taskOne.checkPageIsVisible("3");
    }
}
