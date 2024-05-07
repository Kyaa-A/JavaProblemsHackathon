import java.util.Arrays;

public class PlusOneV2 {
    
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        String numString = Arrays.toString(nums);
        numString = numString.replaceAll("[\\[\\], ]", "");
        System.out.println(numString);

        String plusOne = (Long.parseLong(numString) + 1) + "";
        System.out.println(plusOne);

        String[] num = plusOne.split("");
        int[] numss = new int[num.length];

        for (int i = 0; i < numss.length; i++) {
            numss[i] = Integer.parseInt(num[i]);
        }

        System.out.println(Arrays.toString(numss));

        // String newString[] = numString.split(",");
        // System.out.println(Arrays.toString(newString));
    }



}
