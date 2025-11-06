public class main {
    public static void main(String[] args) {
        int sum=0,i=0;
        while(sum<100){
            if(i%2==1) sum+=i;
            else sum+=-i;
            i++;
        }
        System.out.println(i+"\t"+sum);
    }
}
