import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

    // If an item you are looking for may or may not be NULL, use Optional type
    //therefore use "Optional" to rep empty values, not "null"

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("x");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> banana = Optional.of("Banana");
        Optional<Object> empty = Optional.empty();

    }
}
