package javaexercise;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int input = scan.nextInt();
            int time=0;
            int[] num=new int[100];
            int save = input;
            for(int i = 2;i<save;i++){
                if(input % i == 0){
                    num[time]=i;
                    time++;
                    input = input / i;
                    i--;
                }
            }
            System.out.print(save+"=");
            for(int j = 0;j < time-1;j++){
                System.out.print(num[j]+"*");
            }
            System.out.println(num[time-1]);
        }
    }
}
