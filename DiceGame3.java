// Problem link: https://www.codechef.com/problems/DICEGAME3?fbclid=IwZXh0bgNhZW0CMTAAAR0Y9hQnRHwwQpiivnHdzesJOjUY9gbFvR8naQJQyekaW_ziZcb-MMJUtzQ_aem_AWqFF58OmSobkYd8_10GupJoqezvTIEA7MvdsCq8-QCn9cY7V7XXVWA_p5pwlAT2LtqHa1bHSB_7UqpeGoKJxGxi

import java.util.Scanner;

public class DiceGame3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {
            int input = scan.nextInt();

            int max = 0;
            for (int j = 1; j <= input; j++) {
                int score = 1;
                if (j % 2 == 0) {
                    score = 12;
                }
                max += score;
            }

            System.out.println(max);

        }

        scan.close();
    }

}
