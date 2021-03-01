package javaexercise;

import java.util.Scanner;

public class question32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long a;
        a=scan.nextLong();
        long b,c,d,e;
        b=(a%10000)/1000;
        c=(a%100000)/10000;
        d=(a%1000000)/100000;
        e=(a%10000000)/1000000;
        System.out.println(e+" "+d+" "+c+" "+b);
    }
}
