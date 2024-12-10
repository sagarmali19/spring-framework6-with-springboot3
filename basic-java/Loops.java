public class Loops {
    public static void main(String[] args) {
        int i = 1;

        while(i < 10){
            System.out.println("Hello " + i);
            i++;
        }

        do {
            System.out.println("Hello " + i);
        }while (i < 2);

        for(int j = 0; j < 10; j++)
        {
            System.out.println("Hi " + j);
        }

        int k = 1;
        for(;k<5; k++){
            System.out.println("Sagar " + k);
        }
    }
}
