package javaexercise;

import java.util.Scanner;

public class question12{
    public static void main(String[] args) {
        double profit,bonus;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入利润数额：");
        profit = scan.nextDouble();
        if(profit<=100000 && profit>=0){
            bonus = 0.1*profit;
            System.out.println(bonus);
        }
        else if(profit<=200000){
            bonus = 10000 + 0.075*(profit-100000);
            System.out.println(bonus);
        }
        else if(profit<=400000){
            bonus = 17500 + 0.05*(profit-200000);
            System.out.println(bonus);
        }
        else if(profit<=600000){
            bonus = 27500 + 0.03*(profit-400000);
            System.out.println(bonus);
        }
        else if(profit<=1000000){
            bonus = 39500 + 0.015*(profit-600000);
            System.out.println(bonus);
        }
        else if(profit>1000000){
            bonus = 45500 + 0.01*(profit-1000000);
            System.out.println(bonus);
        }
        else System.out.println("利润输入有误");
    }
}
