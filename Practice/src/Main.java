import java.util.*;


public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        p.method();
        c.method();
    }
}

class Parent{
    int x = 100;

}

class Child extends Parent{
    int x=200;
    void method(){
        System.out.println("x="+x);
        System.out.println("super.x="+super.x);
        System.out.println("this.x="+this.x);
    }
}