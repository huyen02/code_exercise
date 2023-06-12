import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class cauLenhReNhanh {
    public static void main(String[] args) {
//xe > 10 tan thi k dc phep di qua cau, con lai duoc di qua cau


        int x = 12;
        boolean s;

        s = (x > 10) ? true : false;
        if (s) {
            System.out.println("Khong duoc di qua cau");
        } else {
            System.out.println("Duoc di qua cau");
        }
    }
}
