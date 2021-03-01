package javaexercise;

import java.util.Scanner;

public class question42 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int a,b,c,d;
        a=num/1000;
        b=num/100-10*a;
        c=(num%100)/10;
        d=num%1000;
        a=(a+5)%10;b=(b+5)%10;c=(c+5)%10;d=(d+5)%10;
        int temp;
        temp=a;a=d;d=temp;
        temp=b;b=c;c=temp;
        System.out.print("加密后数字为"+a+b+c+d);
    }
}
