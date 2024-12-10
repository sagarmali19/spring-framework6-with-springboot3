class Calculator{
    int a = 6;

    public int add(int num1, int num2){
        System.out.println(a);
        return num1+num2;
    }

    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int num3 = 8;

        // reference variable
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

        int result1 = calc.add(num1, num2, num3);
        System.out.println(result1);
    }

}
