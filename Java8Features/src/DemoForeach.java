import java.util.Arrays;
import java.util.List;

public class DemoForeach {
    public static void runDemo() {
        System.out.println("----- Demo ForEach -----");
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
//        values.forEach(v -> System.out.println(v)); // lambda expression
        values.forEach(System.out::println); // method reference
        System.out.println("----- --------------- -----");
    }
}
