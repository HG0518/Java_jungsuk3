import java.util.Arrays;

public class Exercise09_10 {
    public static void main(String[] args) {
        String str="가나다";

        System.out.println(format(str,7,0));
        System.out.println(format(str,7,1));
        System.out.println(format(str,7,2));
    }

    static String format(String str, int length, int alignment){
        int strLength=str.length();
        if(length<strLength) return str.substring(0,length);
        char[]result=new char[length];
        Arrays.fill(result,' ');

        int startIndex;
        if(alignment==0)startIndex=0;
        else if(alignment==1)startIndex=(length-strLength)/2;
        else startIndex=length-strLength;

        for(int i=0;i<strLength;i++)
            result[startIndex++]=str.charAt(i);

        return String.valueOf(result);
    }
}
