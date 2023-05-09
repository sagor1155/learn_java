
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Ref:
    1. https://www.baeldung.com/java-8-streams
    2.
*/

public class DemoStreamApi {
    public static void runDemo() {
        System.out.println("----- Demo Stream API -----");

        DemoStreamApi demoStreamApi = new DemoStreamApi();
        demoStreamApi.createStream();
        demoStreamApi.testFlatmap();
        demoStreamApi.testReduction();
        System.out.println("----- --------------- -----");
    }

    private void createStream() {
        // from array
        String[] arr = new String[]{"a", "b", "c", "d"};
        Stream<String> arrStream = Arrays.stream(arr);
        arrStream = Stream.of("a", "b", "c");

        // from collection
        List<Integer> values = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 6, 5);
        Stream<Integer> valuesStream = values.stream();
        List<Integer> result = valuesStream
                .filter(v -> v > 0)
                .map(v -> v * 2)
                .distinct()
                .toList();
        System.out.println("Stream from collection: " + result);

        // create parallel stream
        // The code below allows to run method doWork() in parallel for every element of the stream:
        System.out.println("Parallel Stream: ");
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8);
        list.parallelStream().forEach(elem -> {
            Consumer<Integer> doWork = (Integer idx) -> System.out.println("Heavy Work Index " + idx);
            doWork.accept(elem);
        });

        // empty stream
        Stream<String> streamEmpty = Stream.empty();

        // builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println("Stream builder: " + streamBuilder.toList());

        // generate: creates infinite stream
        // MUST specify/limit the desired size, or the generate() method will work until it reaches the memory limit
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        System.out.println("Stream Generated: " + streamGenerated.toList());

        // iterate: creates infinite stream
        // MUST limit the size
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(10);
        System.out.println("Stream Iterated: " + streamIterated.toList());

        // primitives: IntStream, LongStream, DoubleStream
        // As Stream<T> is a generic interface, and there is no way to use primitives as a type parameter with generics, three new special interfaces were created: IntStream, LongStream, DoubleStream.
        IntStream intStream = IntStream.range(1, 6);
        System.out.println("intStream: " + intStream.filter(v -> v > 1).boxed().toList()); // The boxed method converts the int primitive values of an IntStream into a stream of Integer objects.

        // stream of string

    }

    private void testFlatmap() {
        List<Detail> list = new ArrayList<>();
        list.add(new Detail(new ArrayList<>(Arrays.asList(1, 2, 3))));
        list.add(new Detail(new ArrayList<>(Arrays.asList(4, 5, 6))));
        list.add(new Detail(new ArrayList<>(Arrays.asList(7, 8, 9))));

        Stream<Integer> stream = list.stream().flatMap(detail -> detail.getParts().stream());
        System.out.println("Flatten data: " + stream.toList());
    }

    private void testReduction() {
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println("Reduced data: " + reduced);
    }
}

class Detail {
    private final List<Integer> parts;

    public Detail(List<Integer> parts) {
        this.parts = parts;
    }

    public List<Integer> getParts() {
        return parts;
    }
}