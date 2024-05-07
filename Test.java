import java.util.*;

public class Test {
    
    public static void main(String[] args) {
        int[] nums = {2, 4, 1};
        System.out.println('s' - 'z');

        

    }

    public static int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (minimum > prices[i]) {
                minimum = prices[i];
                minIndex = i;
                System.out.println("min" + minIndex);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = minIndex; i < prices.length; i++) {
            max = Integer.max(max, prices[i]);
        }

        return max - minimum;
    }
}
