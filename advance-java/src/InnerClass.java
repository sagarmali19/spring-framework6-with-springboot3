class FirstClass{
    String str;

    public void show(){
        System.out.println("In show");
    }

    class SecondClass{
        public void showSecond(){
            System.out.println("In second show");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        // first define object of FirstClass
        FirstClass firstClass = new FirstClass();
        firstClass.show();

        FirstClass.SecondClass obj = firstClass.new SecondClass();
        obj.showSecond();
    }
}
