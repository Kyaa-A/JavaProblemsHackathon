import java.util.Arrays;

public class AddBinary {
    
    public static void main(String[] args) {
        String s = " Hello,             world!                 I am here          ";
        System.out.println(s.replaceAll("\s+", " ").trim());
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] stringArray = s.replaceAll("\s+", " ").trim().split(" ");
        System.out.println(Arrays.toString(stringArray));
        return stringArray[stringArray.length - 1].length();
    }

}
