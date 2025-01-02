import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(6);
        nums.add(8);

        for (int n : nums){
            System.out.println(n);
        }
    }
}
