import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main3 {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("Ritik", "Raja", "Raj", "Ram", "Rishi");
        System.out.println(arr);

        Optional<String> list = arr.stream()
                                   .filter(name -> name.contains("Ra")) // No match
                                   .findFirst();

        System.out.println(list.orElse("no such element")); // ✅ Output: no such element
    }
}
