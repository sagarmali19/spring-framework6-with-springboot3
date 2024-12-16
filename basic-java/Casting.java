
class A{
    public void show1(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In class B");
    }
}


public class Casting {
    public static void main(String[] args) {
        A obj1 = new B();
        // according to type we call methods of the class
        obj1.show1();

        B obj2 = (B) obj1;
        obj2.show2();
        obj2.show1();
    }
}
