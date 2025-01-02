import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,56,78,98);
        // Logic for lamba expression in for each loop
        //Consumer<Integer> con = (integer) -> System.out.println(integer);
        //nums.forEach(n -> System.out.println(n));
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        //s3.forEach(n -> System.out.println(n));
        // int result = s3.reduce(0, (c,e) -> c+e);
        int result = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);
        System.out.println(result);
    }
}
