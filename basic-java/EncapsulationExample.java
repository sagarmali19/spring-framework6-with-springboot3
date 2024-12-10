class Human{
    private String name;
    private int age;

    public Human(){

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


public class EncapsulationExample {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Sagar");
        h1.setAge(23);
        System.out.println(h1.getAge() + " " + h1.getName());
    }
}
