class Human1{
    private String name;
    private int age;

    public Human1(){

    }

    // getters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class thisExample {
    public static void main(String[] args) {
        Human1 h1 = new Human1();
        h1.setAge(24);
        h1.setName("Nihar");
        System.out.println(h1.getAge() + " " + h1.getName());
    }
}
