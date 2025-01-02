import java.util.HashMap;
import java.util.Map;

public class CollectApiMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Sagar", 55);
        students.put("Harshal", 21);
        students.put("Sam", 34);

        System.out.println(students);
        System.out.println(students.get("Sam"));

        for(String name : students.keySet()){
            System.out.println(name + " " + students.get(name));
        }
    }
}
