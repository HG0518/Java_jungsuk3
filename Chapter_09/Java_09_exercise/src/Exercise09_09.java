import java.util.StringTokenizer;

public class Exercise09_09 {
    public static void main(String[] args) {
        System.out.println("(1!2@3#4~5) -> "+
                delChar("(1!2@3#4~5)","~!@#$%^&*()"));
        System.out.println("(1 2     3    4\t5) -> "+
                delChar("(1 2     3    4\t5)"," \t"));
    }
    static String delChar(String src,String delCh){
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(src, delCh);
        while(st.hasMoreTokens())
            sb.append(st.nextToken());
        return sb.toString();
    }
}
