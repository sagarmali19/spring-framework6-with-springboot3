public class ExceptionExample {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something wrong with array");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
}
