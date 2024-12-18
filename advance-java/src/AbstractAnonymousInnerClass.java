abstract class Example1{
    public abstract void show();
}
public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        Example1 example1 = new Example1() {
            @Override
            public void show() {
                System.out.println("In this show");
            }
        };
        example1.show();
    }

}
