import java.util.Scanner;

public class soSanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a,b;

        System.out.print("Enter a:");
        a = scanner.nextInt();

        System.out.print("Enter b:");
        b = scanner.nextInt();

        System.out.println("a == b:" + (a==b));
        System.out.println("a > b:" + (a>b));
        System.out.println("a < b:" + (a<b));
        System.out.println("a <= b:" + (a<=b));
        System.out.println("a >= b:" + (a>=b));
        System.out.println("a != b:" + (a!=b));
    }
}
