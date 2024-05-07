import java.util.Scanner;

public class HitTestingAnEllipse {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {
            double xc = scan.nextDouble();
            double yc = scan.nextDouble();
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            double result = ((Math.pow(x-xc, 2)) / (a * a)) + ((Math.pow(y-yc, 2)) / (b * b));

            String res = "";

            if (result < 1) res = "Inside";
            else if (result > 1) res = "Outside";
            else res = "On Ellipse";

            System.out.println(res);

        }

        scan.close();
    }

}
