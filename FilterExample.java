import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");

        for (String name : names) {
            if (!name.equals("Sam")) {
                System.out.println(name);
            }
        }

        System.out.println("Functional style:");

        names.stream()
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println);
    }
}
