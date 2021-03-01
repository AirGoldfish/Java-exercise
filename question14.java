package javaexercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字（默认第一天为星期一）：");
        while(true){
            int i = scan.nextInt();
            if((i<=0) || (i>366)) {
                System.out.println("输入有误");
                continue;
            }
            int day = i % 7;
            switch (day){
                case 0:
                    System.out.println("星期日");
                    break;
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                default:
                    break;
            }
        }
    }
}
