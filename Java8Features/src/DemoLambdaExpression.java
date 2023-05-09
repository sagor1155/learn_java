import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoLambdaExpression {
    public static void runDemo() {
        System.out.println("----- Demo Lambda Expression -----");

        LambdaInterface obj1 = new LambdaInterface() {
            public void show(int num) {
                System.out.println("Show - " + num);
            }
        };
        obj1.show(10);


        LambdaInterface obj2 = (int i) -> System.out.println("Show - " + i); // lambda expression, Implementation of interface `LambdaInterface`, Consumer
        obj2.show(11);

        List<Integer> values = Arrays.asList(11, 22, 33, 44);
        Consumer<Integer> consumer = new ConsumerImpl();
//        Consumer<Integer> consumer = System.out::println;
        values.forEach(consumer); // pass consumer object
        System.out.println("----- --------------- -----");
    }
}

// one kind of Consumer interface
interface LambdaInterface {
    void show (int num);
}

// implementation of Consumer interface
class ConsumerImpl implements Consumer<Integer> {
    public void accept(Integer i) {
        System.out.println("Consumer impl: " + i);
    }
}