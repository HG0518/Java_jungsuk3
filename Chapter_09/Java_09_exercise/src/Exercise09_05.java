public class Exercise09_05 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));

    }

    public static int count(String src, String target){
        int count=0;
        int pos=0;
        while(true){
            pos=src.indexOf(target,pos);
            if(pos==-1) return count;
            count++;
            pos+=target.length();
        }
    }
}
