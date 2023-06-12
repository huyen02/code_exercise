import java.util.Scanner;

public class giaiPtBacHai {
    public static void main(String[] args) {
        //Pt bac hai : ax^2 + bx + c = 0(a!=0)
        //Delta: b^2 - 4ac
        //Truong hop cua delta:    delta>0 : phuong trinh co hai nghiem phan biet
                                 //delta<0 ; phuong trinh vo nghiem
                                 //delta==0 : phuong trinh co nghiem kep x1=x2=-b/2a
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a:");
        a = scanner.nextDouble();
        System.out.print("Nhap vao b:");
        b = scanner.nextDouble();
        System.out.print("Nhap vao c:");
        c = scanner.nextDouble();

        if (a==0) {
            System.out.println("Khong thoa man!");


        }else{
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta>0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 =" + x1);
                System.out.println("x2 =" + x2);
            } else if (delta==0) {
                double x = -b/(2*a);
                System.out.println("x=");
            }else{
                System.out.println("Phuong trinh vo nghiem!");


        }



        }
    }
}
