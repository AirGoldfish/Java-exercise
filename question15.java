package javaexercise;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y,z;
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
        System.out.println(Math.max(Math.max(x,y),z));
    }
}
