import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        // -> x1, x2
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        // input
        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        System.out.print("Enter c: ");
        c = scanner.nextInt();

        //step 1: calculate delta
        int delta = b * b - 4 * a * c;

        //tep 2: so sanh delta
        // neu delta > 0                 
        if (delta > 0) {
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (delta == 0){
            double xo = (double) (-b) / (2 * a); //ep kieu
            System.out.println(xo);
        } else {
            System.out.println("vo nghiem");
        }
    }
}
