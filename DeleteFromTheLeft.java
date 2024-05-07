import java.util.Scanner;

public class DeleteFromTheLeft {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();

        System.out.println(minMove(s1, s2));
    }

    static int minMove(String s1, String s2) {
        int counter = 0;
        int s1counter = s1.length() - 1;
        int s2counter = s2.length() - 1;

        for (int i = Integer.min(s1counter, s2counter); i >= 0; i--) {
            if (s1.charAt(s1counter) == s2.charAt(s2counter)) {
                counter++;
                s1counter--;
                s2counter--;
            } else
                return (s1.length() + s2.length()) - (counter * 2);
        }

        return (s1.length() + s2.length()) - (counter * 2);
    }

}
