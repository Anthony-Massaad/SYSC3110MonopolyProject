package JUnitTesting;

import Model.BoardElements.GoToJail;
import Model.GoToJail;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Max Curkovic
 * All necessary tests for the GoToJail class.
 */
public class GoToJailTest {

    /**
     * Test to test the cost of the GoToJail element.
     */
    @Test
    public void testCost(){
        GoToJail goToJail = new GoToJail(0, "Go To Jail!");
        assertEquals(0, goToJail.getCost());
    }
}