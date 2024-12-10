
class Student{
    String name;
    int rollNumber;
    int marks;
}


public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sagar";
        s1.rollNumber = 1;
        s1.marks = 12;

        Student s2 = new Student();
        s2.name = "Dishank";
        s2.rollNumber = 2;
        s2.marks = 23;

        Student arrayStudent[] = new Student[2];
        arrayStudent[0] = s1;
        arrayStudent[1] = s2;

        for(int i = 0; i < arrayStudent.length; i++){
            System.out.println(arrayStudent[i].name + " " + arrayStudent[i].marks + " ");
        }

        // enhanced for loop
        for(Student i : arrayStudent){
            System.out.println(i.name + " " + i.marks);
        }


    }
}
