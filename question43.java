package javaexercise;

import java.util.Scanner;

public class question43 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str=scanner.nextLine();
        System.out.println("请输入子串");
        String s=scanner.nextLine();
        char[] a=str.toCharArray();
        char[] b=s.toCharArray();
        int time=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b[0]){
                boolean flag=true;
                for (int j = 1; j <b.length; j++) {
                    if((i + j) >=a.length){
                        flag = false;
                        break;
                    }
                    else if (a[i + j] != b[j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) time++;
            }
        }
        System.out.println("共出现了"+time+"次");
    }


}
