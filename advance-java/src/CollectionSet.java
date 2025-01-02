import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(3);
        nums.add(6);
        nums.add(8);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());
    }
}
