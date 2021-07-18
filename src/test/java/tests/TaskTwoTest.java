package tests;

import org.junit.jupiter.api.Test;

public class TaskTwoTest extends TestBase {

    @Test
    public void firstTest() {
        main    .goTo()  // "Chain of Invocation" pattern
                .chooseTask("2");
        taskOne.checkPageIsVisible("2");
    }
}
