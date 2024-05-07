import java.util.*;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        long num = toNumber(digits) + 1;
        return toArray(num);
    }

    public static long toNumber(int[] digits) {
        long number = 0;

        for (int i = 0; i < digits.length; i++) {
            number = (number * 10) + digits[i];
            System.out.println(number);
        }

        return number;
    }

    public static int[] toArray(long number) {
        int[] nums = new int[countDigits(number)];

        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = (int) (number % 10);
            number /= 10;
        }

        return nums;
    }

    public static int countDigits(long number) {
        long numOfDigits = 0;

        while (number != 0) {
            numOfDigits++;
            number /= 10;
        }

        return (int) numOfDigits;
    }

}