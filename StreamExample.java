import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = Stream.of("one","two","three")
                .filter(obj -> !obj.equals("one"))
                .peek(obj -> System.out.println("Peeked"+obj))
                .collect(Collectors.toList());

        IntStream.of(1,23,4,5,6,7)
                .skip(2)
                .filter(i -> i>5)
                .forEach( i-> System.out.println(i));
    }

}
