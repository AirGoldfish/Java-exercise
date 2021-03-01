package javaexercise;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        char[] a=input.toCharArray();
        if(a[0]=='-'){
            System.out.println("输入负数");
            System.exit(0);
        }
        else if(a.length>5) {
            System.out.println("超过5位数");
            System.exit(0);
        }
        System.out.println("是"+a.length+"位数");
        int num=0;
        for(int i =a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
