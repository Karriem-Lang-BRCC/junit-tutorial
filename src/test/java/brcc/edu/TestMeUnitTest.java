package brcc.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMeUnitTest {

    @Test
    void testAdd() {
        TestMe test = new TestMe();
        int result = test.add_6_7(6, 7);
        assertEquals(13, result, "Adding 6 + 7 should" +
                " equal 13");

    }
}
