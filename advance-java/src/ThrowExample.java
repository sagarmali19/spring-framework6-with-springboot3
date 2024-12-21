public class ThrowExample {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("Please provide valid denominator");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
