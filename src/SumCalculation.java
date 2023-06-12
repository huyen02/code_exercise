import java.util.Scanner;

public class SumCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter term1: ");
        long term1 = scanner.nextLong();

        System.out.print("Enter term2: ");
        long term2 = scanner.nextLong();

        long sum = term1 + term2;
        System.out.println("Sum: " + sum);
    }
}