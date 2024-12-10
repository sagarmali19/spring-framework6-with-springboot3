class Human2{
    private String name;
    private int age;

    // default constructor
    public Human2(){
        //System.out.println("Inside the constructor");
        name = "Kunal";
        age = 45;
    }

    // parametrized constructor
    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // setters
    public void setName(String namestr){
        name = namestr;
    }
    public void setAge(int age1){
        age = age1;
    }
}


public class constructorExample {
    public static void main(String[] args) {
        Human2 h1 = new Human2();
        // it will print null if we do not assign values to instance variables
        System.out.println(h1.getAge() + " " + h1.getName());

        Human2 h2 = new Human2("Harshal", 25);
        System.out.println(h2.getAge() + " " + h2.getName());
    }
}
