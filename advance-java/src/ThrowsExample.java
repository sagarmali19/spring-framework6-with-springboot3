class Example23{
    public void show() throws ClassNotFoundException {
        Class.forName("Inner");
    }
}
public class ThrowsExample {
    public static void main(String[] args) {
        Example23 example23 = new Example23();
        try{
            example23.show();
            System.out.println("All good");
        }
        catch (ClassNotFoundException c){
            System.out.println("This is stack trace");
            c.printStackTrace();
        }
    }
}
