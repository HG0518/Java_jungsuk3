public class Exercise07_18_2 {

    public static void main(String[] args) {
        Robot1[]arr = {new DanceRobot1(),new SingRobot1(),new DrawRobot1()};

        for (Robot1 robot1 : arr) {
            robot1.action();
        }

    }
}

class Robot1{
    void action(){}
}

class DanceRobot1 extends Robot1{
    void action(){
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot1 extends Robot1{
    void action(){
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot1 extends Robot1{
    void action(){
        System.out.println("그림을 그립니다.");
    }
}
