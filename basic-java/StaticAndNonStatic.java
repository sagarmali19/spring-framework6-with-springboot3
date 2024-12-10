
class Mobile{
    String name;
    int price;

    static String brand;

    // static block
    static {
        brand = "Samsung";
        System.out.println("Inside static block");
    }

    // constructor
    public Mobile(){
        name = "m";
        price = 233;
        System.out.println("Inside constructor");
    }

    public void show(){
        System.out.println(brand + " " + name + " " + price);
    }

    public static void show1(Mobile obj){
        System.out.println(brand + " " + obj.name + " " + obj.price);
    }
}


public class StaticAndNonStatic {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile m1 = new Mobile();
        m1.name = "m21";
        m1.price = 2333;
        m1.show();

        Mobile m2 = new Mobile();
        m2.name = "m23";
        m2.price = 211;
        m2.show();

        System.out.println("Calling static method for the objects : ");
        Mobile.show1(m1);
        Mobile.show1(m2);

        // to load the class without creating the object
        //Class.forName("Mobile");
    }

}
