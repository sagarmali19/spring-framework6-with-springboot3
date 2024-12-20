interface ExampleInterface{
    int age = 23;

    String area = "Mumbai";

    void show();
    void write();
}

class ExampleClass implements ExampleInterface{
    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void write() {
        System.out.println("In write");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.show();
        exampleClass.write();

        System.out.println(ExampleInterface.age);
    }
}
