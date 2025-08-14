package basic.c08_oop;

public class Cars {
    private int speed;
    public Cars(int speed){
        if (speed >= 0 && speed <= 120){
            this.speed = speed;
        }else {
            System.out.println("Debe considerar una velocidad mayor o igual a 0 km");
        }
    }
    public void accelerate(int amount){
        if(speed + amount <= 120){
            speed += amount;
        }else {
            speed = 120;
        }
    }
    public void brake(int amount){
        if (speed - amount >= 0){
            speed -= amount;
        }else {
            speed = 0;
        }
    }
    public int getSpeed(){
        return speed;
    }
}
