public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi(" -042"));

        // boolean isValid = "9".matches("\\d");
        // System.out.println(isValid);
    }

    public static int myAtoi(String s) {
        String newS = s.trim();
        int result = 0;
        boolean isNegative = newS.charAt(0) == '-';
        int i = isNegative ? 1 : 0;
        int sign = isNegative ? -1 : 1;


        for (; i < newS.length(); i++) {
            String digit = Character.toString(newS.charAt(i));
            if (!digit.matches("[\\d]")) {
                
                return result;
            }

            result = (result * 10) + (newS.charAt(i) - '0');
        }

        return result * sign;
    }
}
