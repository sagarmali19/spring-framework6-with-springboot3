class Hi extends Thread{
    @Override
    public void run(){
        show();
    }
    public void show() {
        for(int i = 0; i < 111; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello extends Thread{
    @Override
    public void run(){
        show();
    }
    public void show(){
        for(int i = 0; i < 111; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadExample {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        //obj1.show();
        //obj2.show();

        //obj2.setPriority(10);
        obj1.start();
        obj2.start();
    }
}
