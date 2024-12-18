
class Class1{
    public void show(){
        System.out.println("In class1 show");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Class1 class1 = new Class1()
        {
            public void show(){
                System.out.println("In new show");
            }
        };

        class1.show();
    }
}
