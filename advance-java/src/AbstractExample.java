abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music in the car");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        UpdatedWagonR updatedWagonR = new UpdatedWagonR();
        updatedWagonR.fly();
        updatedWagonR.drive();
        updatedWagonR.playMusic();
    }
}
