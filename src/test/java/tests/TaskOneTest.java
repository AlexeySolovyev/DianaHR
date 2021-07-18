package tests;

import org.junit.jupiter.api.Test;

public class TaskOneTest extends TestBase {


    @Test
    public void firstTest() {
        main    .goTo()  // "Chain of Invocation" pattern
                .chooseTask("1");
        taskOne.checkPageIsVisible("1");
    }
}
