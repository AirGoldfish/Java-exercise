package javaexercise;

import java.util.Arrays;

public class question31 {
    public static void main(String[] args) {
        int[] num=MakeNum();
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length/2; i++) {
            int temp;
            temp=num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
    public static int[] MakeNum() {
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            for(int j=0;j<i;j++) {
                if(a[i]==a[j]) {
                    i--;
                    break;
                }
            }
        }
        return a;
    }
}
