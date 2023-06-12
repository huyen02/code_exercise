import java.util.Scanner;

public class vongLapDoWhile {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao a>0:");
            a = scanner.nextInt();
        }while (a <= 0);

    }
}
