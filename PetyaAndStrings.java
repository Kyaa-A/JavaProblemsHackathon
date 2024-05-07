import java.util.Scanner;

public class PetyaAndStrings {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine().toLowerCase();
        String s2 = scan.nextLine().toLowerCase();
        int diff = 0;

        for (int i = 0; i < s.length(); i++) {
            diff = s.charAt(i) - s2.charAt(i);

            if (diff > 0) {
                diff = 1;
            } else if (diff < 0) {
                diff = -1;
            }
        }

        System.out.println(diff);

    }


}
