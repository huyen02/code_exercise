import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Nhập 1 số nguyên : " );
        x = scanner.nextInt();
        System.out.println("Sau khi nhập x = " + x );
        System.out.print("Nhập 1 số nguyên : " );
        y = scanner.nextInt();
        System.out.println("Sau khi nhập y = " + y );
        int z = x + y;
        System.out.println("Sau khi nhập z = " + z );
}
}