import java.util.*;


public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        Car c3 = c1;
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white","auto",4);
    }

    Car(String color, String gearType, int door){
        this.color=color;
        this.gearType=gearType;
        this.door=door;
    }

    Car(Car c){
        color =c.color;
        gearType=c.gearType;
        door=c.door;
    }
}