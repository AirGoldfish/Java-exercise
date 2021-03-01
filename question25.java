package javaexercise;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            if ((num < 10000) || (num > 99999)) {
                System.out.println("输入的不是五位数");
                System.exit(0);
            }
            int a, b, c, d;
            a = num / 10000;
            b = num / 1000 - 10 * a;
            c = (num % 100) / 10;
            d = num % 10;
            if ((a == d) && (b == c)) System.out.println("是回文数");
            else System.out.println("不是回文数");
        }
    }
}
