package brcc.edu;

/**
 * Unit test for the TestMe class.
 *
 * This class uses JUnit 5 to test the implementation of the
 *  TestMe class methods -> expected result.
 *  In addition, each Test has a specific failure message.
 *
 * @author Karriem Lang
 * @version 1.0
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test -> add method {return: 6 + 7 = 13}
 */
public class TestMeUnitTest {

    @Test
    void testAdd() {
        TestMe test = new TestMe();
        int result = test.add(6, 7);
        assertEquals(13, result, "Adding 6 + 7 should" +
                " equal 13");
    }

    /**
     * Test -> subtract method {return: 15 - 12 = 3}
     */
    @Test
    void testSubtract_15_12() {
        TestMe test = new TestMe();
        int result = test.subtract(15, 12);
        assertEquals(3, result, "Subtracting  15 - 12 should" +
                " equal 3");
    }

    /**
     * Test -> multiply method {return: 4 * 5 = 20}
     */
    @Test
    void testMultiply_4_5() {
        TestMe test = new TestMe();
        int result = test.multiply(4, 5);
        assertEquals(20, result, "Multiplying 4 times 5 should equal 20");
    }

    /**
     * Test -> add divide {return: 50.0 + 3.0 = 16.66666}
     */
    @Test
    void testDivide_50_3() {
        TestMe test = new TestMe();
        double result = test.divide(50.0, 3.0);

        // Verify precision -> delta 0.001
        assertEquals(16.66666, result, 0.001, "50.0 divided " +
                "by 3.0 should return 16.66666");
    }

    /**
     * Test -> isEven method {return: boolean}
     */
    @Test
    public void test_isEven_60() {
        TestMe test = new TestMe();
        boolean result = test.isEven(60);
        assertTrue(result, "isEven(60) should return true");
    }

    /**
     * Test -> subString in String {boolean}
     */
    @Test
    public void test_containsSubstring() {
        TestMe test = new TestMe();
        String msg = "Java testing is NOT fun!";
        String subString = "Java";
        boolean result = test.containsSubstring(msg, subString);
        assertTrue(result, "'Java testing is fun!' should contain 'Java'");
    }

    }
