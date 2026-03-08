package brcc.edu;

/**
 * Methods to be teste with JUnits and Maven
 *
 * @author Karriem Lang
 * @version 1.0
 */
public class TestMe {

    // add method
    public int add(int a, int b) {
        return a + b;
    }

    // subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    // multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }

    // division method
    public double divide(double a, double b) {
        return a / b;
    }

    // isEven method
    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    // subString check
    public boolean containsSubstring(String string, String subString) {
        return string.contains(subString);
    }
}
