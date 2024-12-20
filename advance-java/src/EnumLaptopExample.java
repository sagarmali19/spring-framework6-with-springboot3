enum Laptop{
    // objects and now constructor
    Macbook(2000), XPS(1200), ThinkPad(3344), Surface;

    // default constructor
    private Laptop() {
        this.price = 500;
    }

    private int price;

    // private constructors as objects are in same class
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumLaptopExample {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice());

        for (Laptop lap1 : Laptop.values()){
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
}
