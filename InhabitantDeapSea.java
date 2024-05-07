import java.util.*;

public class InhabitantDeapSea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        for (int i = 0; i < testCase; i++) {
            int numShips = scan.nextInt();
            int krakenAttack = scan.nextInt();
            int[] ships = new int[numShips];

            for (int j = 0; j < numShips; j++) {
                ships[j] = scan.nextInt();
            }

            int firstCounter = 0;
            int lastCounter = ships.length - 1;
            int attackCounter = 1;
            boolean willAttackFirstShip = true;
            while (krakenAttack >= attackCounter++) {
                if (willAttackFirstShip) {
                    ships[firstCounter]--;
                    if (ships[firstCounter] == 0) firstCounter++;
                } else {
                    ships[lastCounter]--;
                    if (ships[lastCounter] == 0) lastCounter--;
                }

                willAttackFirstShip = !willAttackFirstShip;
            }

            System.out.println(ships.length - ((lastCounter - firstCounter) + 1));
        }

        scan.close();
    }
}
