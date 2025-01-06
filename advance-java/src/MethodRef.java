import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Sagar", "Navin", "Harshal");
        List<String> uNames = name.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uNames);
    }
}
