package javaexercise;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int m, n, r = -1;
            m = scan.nextInt();
            n = scan.nextInt();
            int max = Math.max(m, n);
            int min = Math.min(m, n);
            while (r != 0) {
                r = max % min;
                max = min;
                min = r;
            }
            System.out.println("最大公约数为：" + max + " 最小公倍数为" + m * n / max);
        }
    }
}
