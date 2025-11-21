import java.util.*;

public class Exercise08_08 {
    public static void main(String[] args) {
        Play p = new Play();
        p.start();
    }
}

class Play{
    private int answer;
    Play(){
        setRNumber();
    }

    private void setRNumber(){
        answer=(int)(Math.random()*100+1);
    }

    public void start(){
        int input=-1;
        while(input!=answer){
            input=guess();
        }
    }

    private int guess(){
        Scanner sc =new Scanner(System.in);
        try {
            System.out.print("1부터 100사이의 값을 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if(input>answer) {
                System.out.println("더 작은 수를 입력하세요.");
                return input;
            }
            else if(input==answer) {
                System.out.println("정답입니다.");
                return input;
            }
            else {
                System.out.println("더 큰 수를 입력하세요.");
                return input;
            }
        }catch(NumberFormatException e){
            System.out.println("잘못된 입력입니다.");
            return -1;
        }

    }

}


