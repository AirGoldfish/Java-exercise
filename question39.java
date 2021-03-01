package javaexercise;

import java.util.Scanner;

public class question39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(function(num));
    }

    public static double function(int a) {
        double sum=0;
        if(a%2==0){
            for (double i = 2; i <=a; i=i+2) {
                sum=sum+1/i;
            }
        }
        else {
            for (double i = 1; i <=a; i=i+2) {
                sum= sum+1/i;
            }
        }
        return sum;
    }
}
