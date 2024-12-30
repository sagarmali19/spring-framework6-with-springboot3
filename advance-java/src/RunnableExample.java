
//class Hi1 implements Runnable{
//    @Override
//    public void run() {
//        for(int i = 0; i < 5; i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class Hello1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // using lambda expression as runnable is functional interface
        Runnable obj1 = () -> {
                for(int i = 0; i < 5; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                     }
                }
        };
        Runnable obj2 = new Hello1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
