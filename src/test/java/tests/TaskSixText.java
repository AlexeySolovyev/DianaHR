package tests;

import org.junit.jupiter.api.Test;

public class TaskSixText extends TestBase{
    @Test
    public void loginWithCorrectCredentials() {
        main.goTo()
                .chooseTask("6");

    }

}
