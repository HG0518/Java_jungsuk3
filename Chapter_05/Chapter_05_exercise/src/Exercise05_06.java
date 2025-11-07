public class Exercise05_06 {
    public static void main(String[] args) {
        int[] coinUint={500,100,50,10};
        int money=2680;
        System.out.println("money="+money);
        for(int i=0;i<coinUint.length;i++){
            int count = money/coinUint[i];
            System.out.println(coinUint[i]+"원 : "+count);
            money-=coinUint[i]*count;
            //money=money%coinUint[i];
        }
    }
}
