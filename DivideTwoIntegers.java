public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 2));
    }

    public static int divide(int dividend, int divisor) {
        int sign = 0;
        int result = 0;


        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            sign = 1;
        } else {
            sign = -1;
        }

        if (dividend < 0) dividend *= -1;
        if (divisor < 0) divisor *= -1;

        System.out.println("Dividend: "+ dividend+ " Divisor: "+divisor );

        if (divisor == 1) return dividend*sign;
        if (dividend == 0 || dividend < divisor) return 0;

        do {
            dividend -= divisor;
            result++;
        } while (dividend > 0 && divisor < dividend);

        return result * sign;
    }
}