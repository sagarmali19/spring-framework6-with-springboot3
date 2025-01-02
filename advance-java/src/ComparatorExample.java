import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        if(this.age > that.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(61);
        nums.add(98);
        Collections.sort(nums);
        System.out.println(nums);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Collections.sort(nums, comp);
        System.out.println(nums);

        List<Students> studs = new ArrayList<>();
        studs.add(new Students("Sagar", 23));
        studs.add(new Students("Harshal", 42));
        studs.add(new Students("Sam", 12));

        Collections.sort(studs);

        for(Students stud : studs){
            System.out.println(stud);
        }
    }
}
