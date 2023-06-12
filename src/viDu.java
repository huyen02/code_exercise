import java.util.Scanner;

public class viDu {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so a : ");
        a = scanner.nextDouble();

        System.out.print("Nhap vao so b : ");
        b = scanner.nextDouble();

        //Ham gia tri tuyet doi
        System.out.println("|a| = " + Math.abs(a));

        //Ham min
        System.out.println("min(a,b) = " + Math.min(a, b));

        //Ham max
        System.out.println("max(a,b) = " + Math.max(a, b));

        //Ham can bac hai
        System.out.println("sqrt(a) = " + Math.sqrt(b));

        //Ham log
        System.out.println("log(a) = " + Math.log(a));

        //Ham luy thua
        System.out.println("a^b = " + Math.pow(a, b));

    }
}
