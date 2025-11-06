public class Exercise4_12 {
    public static void main(String[] args) {
        int x,y;
        for (int i = 0; i < 9; i++) {
            x=(i/3+1)*3 -1;
            y=i%3+1;
            for (int j = 0; j < 3; j++) {
                if(x>9)break;
                System.out.print(x + "*" + y + "=" + x * y+"\t");
                x++;
            }
            System.out.println();

            if(i%3==2) System.out.println();
        }
    }
}
