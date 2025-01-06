import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sagar", "Harshal", "Sayam");
        String name = list.stream()
                .filter(str -> str.contains("y"))
                .findFirst()
                .orElse("Not found");
        System.out.println(name);
    }
}
