package javaexercise;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        int space=0,Engchar=0,CNchar=0,num=0,other=0;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char a[] = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==32){
                space++;
            }
            else if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122)){
                Engchar++;
            }
            else if(a[i]>=48 && a[i]<=57){
                num++;
            }
            else if(a[i]<128 && a[i]>0){
                other++;
            }
            else CNchar++;
        }
        System.out.println("共有空格"+space+"个，"+"共有英文字符"+Engchar+"个，"+"共有中文字符"+CNchar+"个，"+"共有数字"+num+"个，"+"共有其他字符"+other+"个");
    }
}
