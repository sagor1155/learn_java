import static java.lang.System.out;

public class DemoSwitchCase {

    public static void runDemo() {
        String day = "Monday";

        // New switch cas and expression
        // No need to use break if we use '->' instead of ':'
        switch(day) {
            case "Saturday", "Sunday" -> out.println("Saturday or Sunday");
            case "Monday" -> out.println("Monday");
            default -> out.println("Other day");
        }

        // possible to return value from switch statement
        String result = switch(day)
        {
            case "Saturday", "Sunday" -> "11am"; // seems like a lambda expression
            case "Monday" -> "10:30am";
            default -> "9:45am";
        };
        out.println("Result: " + result);

        // use of 'yield'
        // use ': yield' instead of '->'
        String result2 = switch(day)
        {
            case "Saturday", "Sunday" : yield "11am"; // seems like a lambda expression
            case "Monday" : yield "10:30am";
            default : yield "9:45am";
        };
        out.println("Result-2: " + result2);

    }
}
