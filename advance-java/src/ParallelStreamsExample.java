import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>();
        Random ran = new Random();
        for(int i = 1; i < size; i++){
            nums.add(ran.nextInt(100));
        }
        int sum = nums.stream()
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);
        //System.out.println(sum);

        long start = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(n ->
                {
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n*2;
                })
                .mapToInt(i -> i)
                .sum();
        //System.out.println(sum2);
        long end = System.currentTimeMillis();
        long time = end - start;

        long start1 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(n -> {
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n*2;
                })
                .mapToInt(i -> i)
                .sum();
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;

        System.out.println("Stream : " + time);
        System.out.println("Parellel stream : " + time1);
    }
}
