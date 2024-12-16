class SimpleCalc{

    SimpleCalc(){
        System.out.println("inside simple calculator");
    }
    public int add(int a, int b){
        int result = a + b;
        return result;
    }

    public int sub(int a, int b){
        int result = a - b;
        return result;
    }
}

// single inheritance
// multiple inheritance -> another class will extend AdvCalc
class AdvCalc extends SimpleCalc{

    AdvCalc(){
        System.out.println("Inside advance calculator");
    }

    AdvCalc(int number){
        // call constructor of the same class
        this();
        System.out.println("Inside para constructor");
    }

    public int mul(int a, int b){
        int result = a * b;
        return result;
    }

    public int div(int a, int b){
        int result = a / b;
        return result;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // it will print both constructors' output
        AdvCalc calc = new AdvCalc();
        int result = calc.add(2,3);
        System.out.println(result);

        // see the output for this
        AdvCalc calc1 = new AdvCalc(result);
    }
}
