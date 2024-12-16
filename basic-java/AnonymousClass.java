
class ObjExample{
    ObjExample(){
        System.out.println("Inside the object");
    }

    public void show(){
        System.out.println("Inside show method");
    }
}


public class AnonymousClass {
    public static void main(String[] args) {
        // anonymous object
        // only present in the heap not in the stack
        new ObjExample().show();
    }
}
