package javaexercise;

import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,max,min,mid;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        max=Math.max(Math.max(a,b),c);
        min=Math.min(Math.min(a,b),c);
        mid=(a>min)&&(a<max)?a:((b>min)&&(b<max)?b:c);
        System.out.println(max+" "+mid+" "+min);
    }
}
