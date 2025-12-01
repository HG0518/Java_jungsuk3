public class Exercise09_11 {
    public static void main(String[] args) {
        int startN=0;
        int endN=0;
        try {
            if (args.length != 2) {
                throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            }

            startN = Integer.parseInt(args[0]);
            endN = Integer.parseInt(args[1]);

            if (startN > 9 || startN < 2 || endN > 9 || endN < 2) {
                throw new Exception("단의 범위는 2와 9사이의 값이어야 합니다.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("USAGE : GugudanTest 3 5");
            System.exit(0);
        }

        for(int i=startN;i<=endN;i++){
            for(int j=1;j<=9;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
