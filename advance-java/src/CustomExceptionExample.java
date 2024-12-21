class SagarException extends Exception{
    public SagarException(String str){
        super(str);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0){
                throw new SagarException("Please provide bigger number");
            }
        }
        catch (SagarException e){
            System.out.println("Default output is : " + e);
        }
    }
}
