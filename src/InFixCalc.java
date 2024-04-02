import java.util.*;

/**
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 * 
 * @author Rob Nash
 * @author Quinn Epstein
 * @date 4/1/24
 */
public class InFixCalc {

    public static void main(String[] args) {
        String input0 = "4 + 4";
        int expectedOutput0 = 8;

        String input1 = "4 + 4 / 2";
        int expectedOutput1 = 4;

        String input2 = "1 / -5 + 2 * 10";
        int expectedOutput2 = 20;

        String input3 = "1 * -3 + 6 / 3";
        int expectedOutput3 = 1;

        String input4 = "5";
        int expectedOutput4 = 5;

        String input5 = "-5";
        int expectedOutput5 = -5;

        System.out.println(input0 + " expected " + expectedOutput0 + " got " + calculate(input0));
        System.out.println(input1 + " expected " + expectedOutput1 + " got " + calculate(input1));
        System.out.println(input2 + " expected " + expectedOutput2 + " got " + calculate(input2));
        System.out.println(input3 + " expected " + expectedOutput3 + " got " + calculate(input3));
        System.out.println(input4 + " expected " + expectedOutput4 + " got " + calculate(input4));
        System.out.println(input5 + " expected " + expectedOutput5 + " got " + calculate(input5));

    }
    // TODO: Complete the calculate() function below

    /**
     * Calculates the infix calculation from the given string
     * 
     * @param input the equation that will be calculated. All binary operations are
     *              separated via a space
     * @return      an int which is the result of the infix calculation
     */
    public static int calculate(String input) {
        int second;
        Scanner scanner = new Scanner(input);
        int first = scanner.nextInt();
        while(scanner.hasNext()){
            switch (scanner.next()){
                case "+":
                    second = scanner.nextInt();
                    first += second;
                    break;
                case "-":
                    second = scanner.nextInt();
                    first -= second;
                    break;
                case "*":
                    second = scanner.nextInt();
                    first *= second;
                    break;
                case "/":
                    second = scanner.nextInt();
                    first /= second;
            }
        }
        return first;
    }
}
