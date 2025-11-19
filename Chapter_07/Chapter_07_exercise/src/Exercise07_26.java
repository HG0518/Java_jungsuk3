public class Exercise07_26 {
    public static void main(String[] args) {
        Outer1.Inner in = new Outer1.Inner();
        System.out.println(in.iv);
    }
}

class Outer1{
    static class Inner{
        int iv=200;
    }
}
