package javaexercise;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,n,sum=0,plus=0;
        System.out.println("请输入数字a：");
        a=scan.nextInt();
        System.out.println("请输入个数n：");
        n=scan.nextInt();
        System.out.print("s=");
        for(int i = 0; i<n-1;i++){
            for(int j=0;j<=i;j++){
                plus=(int)(a*Math.pow(10,j))+plus;
            }
            sum=sum+plus;
            System.out.print(plus+"+");
            plus=0;
        }
        plus=0;
        for(int i = 0;i<n;i++) {
            plus=(int)(a*Math.pow(10,i))+plus;
        }
        sum=sum+plus;
        System.out.print(plus + "=" + sum);
    }
}
