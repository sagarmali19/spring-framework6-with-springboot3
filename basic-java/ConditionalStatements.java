public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        if(x > y){
            System.out.println("Hello");
        }
        else {
            System.out.println("Bye");
        }

        if(x > y){
            System.out.println("Sagar");
        } else if (x < y) {
            System.out.println("Harshal");
        }
        else {
            System.out.println("Sayam");
        }

        int s = 5;
        int result = 0;

        result = s > 10 ? 15 : 20;
        System.out.println(result);

        // switch statement
        int day = 8;
        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
