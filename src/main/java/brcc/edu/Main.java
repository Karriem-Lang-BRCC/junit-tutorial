package brcc.edu;

/**
 * Main class -> program entry.
 * Demonstrates implementation of each method in TestMe
 *  with output to console.
 *
 * @author Karriem Lang
 * @version 1.0
 */
public class Main
{
    /**
     * Create TestMe object demonstrating each method call.
     */
    static void main(String[] args) {

        // TestMe instance
        TestMe test = new TestMe();

        // String for subString testing
        String msg = "Java testing is fun!";
        String subSting = "Java";

        // Output of method calls
        System.out.println("add 6 + 7: " + test.add(6, 7));
        System.out.println("subtract 15 - 12: " + test.subtract(15, 12));
        System.out.println("multiply 4 * 5: " + test.multiply(4, 5));
        System.out.println("divide 10.0 / 2.0: " + test.divide(10.0, 2.0));
        System.out.println("isEven 60: " + test.isEven(60));

    }// end main
}