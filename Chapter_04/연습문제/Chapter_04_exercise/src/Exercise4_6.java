public class Exercise4_6 {
    public static void main(String[] args) {
        int dice_1,dice_2;
        System.out.println("눈의 합이 6이 되는 경우의 수");
        System.out.println("dice1\tdice2");
        for(dice_1 = 1; dice_1 <= 6; dice_1++){
            for(dice_2 = 1; dice_2 <= 6; dice_2++){
                if(dice_1 +dice_2 == 6){
                    System.out.printf("%5d\t%5d\n", dice_1, dice_2);
                }
            }
        }
    }
}
