@java.lang.FunctionalInterface
interface FunctionalInterfaceExample{
    void show();
}

//class InterfaceImplementation implements FunctionalInterfaceExample{
//    @Override
//    public void show() {
//        System.out.println("In show");
//    }
//}

public class FunctionalInterface {
    public static void main(String[] args) {
//        InterfaceImplementation obj = new InterfaceImplementation();
//        obj.show();

//        using anonymous inner class
//        FunctionalInterfaceExample obj = new FunctionalInterfaceExample() {
//            @Override
//            public void show() {
//                System.out.println("In show");
//            }
//        };
//        obj.show();

        // using lambda expression
        FunctionalInterfaceExample obj = () -> {System.out.println("In show");};
        obj.show();
    }
}