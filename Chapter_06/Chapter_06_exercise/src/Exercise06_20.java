public class Exercise06_20 {
    public static void main(String[] args) {
        int[] original={1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result=shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

        shuffle2(original);
        System.out.println(java.util.Arrays.toString(original));

    }

    static int[] shuffle(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index = (int)(Math.random()*arr.length);
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
        return arr;
    }

    static void shuffle2(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index = (int)(Math.random()*arr.length);
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
    }
}
