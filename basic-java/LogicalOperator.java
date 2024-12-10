public class LogicalOperator {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int a = 3;
        int b = 4;

        boolean result = x > y && a > b;
        System.out.println(result);

        boolean result1 = x < y || a > b;
        System.out.println(result1);
    }
}
