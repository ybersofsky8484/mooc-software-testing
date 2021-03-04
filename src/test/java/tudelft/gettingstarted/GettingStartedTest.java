package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test // indicates that the following is a JUnit test

    // test passing the number 20 to the addFive function:
    public void addFiveToTwenty() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }

    @Test
     public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
     public void addFiveToMinusTwenty() {
        // Note: Can't use hyphen, must use minus symbol... en dash?
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }
}
