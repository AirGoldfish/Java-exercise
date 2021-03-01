package javaexercise;

import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
            String input = scan.nextLine();
            char[] a= input.toCharArray();
            if((a[0]=='M')||(a[0]=='m')) System.out.println("星期一");
            else if((a[0]=='T')||a[0]=='t'){
                if((a[1]=='U')||(a[1]=='u')) System.out.println("星期二");
                else if((a[1]=='H')||(a[1]=='h')) System.out.println("星期四");
            }
            else if((a[0]=='W')||(a[0]=='w')) System.out.println("星期三");
            else if((a[0]=='F')||(a[0]=='f')) System.out.println("星期五");
            else if((a[0]=='S')||a[0]=='s'){
                if((a[1]=='A')||(a[1]=='a')) System.out.println("星期六");
                else if((a[1]=='U')||(a[1]=='u')) System.out.println("星期日");
            }
            else System.out.println("输入有误，请重新输入");
        }
    }
}
