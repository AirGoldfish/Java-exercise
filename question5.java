package javaexercise;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int score = scan.nextInt();
            String str;
            System.out.println(str =score>100?"成绩输入不正确":( score >= 90 ? "A" : (score >=60 ? "B" : (score>=0?"C":"成绩输入不正确"))));
        }
    }
}
