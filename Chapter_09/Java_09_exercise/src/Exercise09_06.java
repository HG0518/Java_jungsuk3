public class Exercise09_06 {
    public static void main(String[] args) {
        String src="12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }

    public static String fillZero(String src, int length){
        int srcLength=src.length();
        if(src==null||srcLength==length) return src;
        if(length<=0) return "";
        if(srcLength>length) return src.substring(0,srcLength-length+1);


        char[]str=new char[length];
        int i=0;
        for(;i<length-srcLength;i++)
            str[i]='0';
        for(;i<length;i++)
            str[i]=src.charAt(i-srcLength);
        //System.arraycopy(src.toCharArray(),0,str,srcLength,src.length());
        return String.valueOf(str);
    }
}
